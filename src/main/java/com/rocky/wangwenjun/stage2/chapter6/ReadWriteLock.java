package com.rocky.wangwenjun.stage2.chapter6;

public class ReadWriteLock {

    private int readingReaders;
    private int waitingReaders;
    private int writingWriters;
    private int waitingWriters;
    private boolean preferWrite = true;

    public ReadWriteLock(){
        this(true);
    }

    public ReadWriteLock(boolean preferWrite){
        this.preferWrite = preferWrite;
    }


    public synchronized void readLock() throws InterruptedException{
        this.waitingReaders++;
        try {
            while (this.writingWriters > 0 || (preferWrite && waitingWriters > 0)){
                this.wait();
            }
            this.readingReaders++;
        } finally {
            this.waitingReaders--;
        }
    }

    public synchronized void readUnlock() {
        this.readingReaders--;
        this.notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException{
        this.waitingWriters++;
        try {
            while (readingReaders>0 || this.writingWriters>0){
                this.wait();
            }
        } finally {
            this.waitingWriters--;
        }
    }
    public synchronized void writeUnlock() throws InterruptedException{
        this.writingWriters--;
        notifyAll();
    }


}
