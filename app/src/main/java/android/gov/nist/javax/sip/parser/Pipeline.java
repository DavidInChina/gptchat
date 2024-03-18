package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class Pipeline extends InputStream {
    private LinkedList buffList = new LinkedList();
    private Buffer currentBuffer;
    private boolean isClosed;
    private SIPStackTimerTask myTimerTask;
    private InputStream pipe;
    private int readTimeout;
    private SipTimer timer;

    /* loaded from: classes.dex */
    public class Buffer {
        byte[] bytes;
        int length;
        int ptr = 0;

        public Buffer(byte[] bArr, int i10) {
            this.length = i10;
            this.bytes = bArr;
        }

        public int getNextByte() {
            byte[] bArr = this.bytes;
            int i10 = this.ptr;
            this.ptr = i10 + 1;
            return bArr[i10] & 255;
        }
    }

    /* loaded from: classes2.dex */
    public class MyTimer extends SIPStackTimerTask {
        private boolean isCancelled;
        Pipeline pipeline;

        public MyTimer(Pipeline pipeline) {
            this.pipeline = pipeline;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void cleanUpBeforeCancel() {
            this.isCancelled = true;
            this.pipeline = null;
            super.cleanUpBeforeCancel();
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (this.isCancelled) {
                this.pipeline = null;
                return;
            }
            try {
                this.pipeline.close();
            } catch (IOException e10) {
                InternalErrorHandler.handleException(e10);
            }
        }
    }

    public Pipeline(InputStream inputStream, int i10, SipTimer sipTimer) {
        this.timer = sipTimer;
        this.pipe = inputStream;
        this.readTimeout = i10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed = true;
        synchronized (this.buffList) {
            this.buffList.notifyAll();
        }
        this.pipe.close();
    }

    public boolean isClosed() {
        return this.isClosed;
    }

    @Override // java.io.InputStream
    public int read() {
        synchronized (this.buffList) {
            try {
                Buffer buffer = this.currentBuffer;
                if (buffer != null && buffer.ptr < buffer.length) {
                    int nextByte = buffer.getNextByte();
                    Buffer buffer2 = this.currentBuffer;
                    if (buffer2.ptr == buffer2.length) {
                        this.currentBuffer = null;
                    }
                    return nextByte;
                } else if (this.isClosed && this.buffList.isEmpty()) {
                    return -1;
                } else {
                    while (this.buffList.isEmpty()) {
                        try {
                            this.buffList.wait();
                            if (this.buffList.isEmpty() && this.isClosed) {
                                return -1;
                            }
                        } catch (InterruptedException e10) {
                            throw new IOException(e10.getMessage());
                        } catch (NoSuchElementException e11) {
                            e11.printStackTrace();
                            throw new IOException(e11.getMessage());
                        }
                    }
                    Buffer buffer3 = (Buffer) this.buffList.removeFirst();
                    this.currentBuffer = buffer3;
                    int nextByte2 = buffer3.getNextByte();
                    Buffer buffer4 = this.currentBuffer;
                    if (buffer4.ptr == buffer4.length) {
                        this.currentBuffer = null;
                    }
                    return nextByte2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void startTimer() {
        if (this.readTimeout == -1) {
            return;
        }
        MyTimer myTimer = new MyTimer(this);
        this.myTimerTask = myTimer;
        this.timer.schedule(myTimer, this.readTimeout);
    }

    public void stopTimer() {
        SIPStackTimerTask sIPStackTimerTask;
        if (this.readTimeout != -1 && (sIPStackTimerTask = this.myTimerTask) != null) {
            this.timer.cancel(sIPStackTimerTask);
        }
    }

    public void write(byte[] bArr, int i10, int i11) {
        if (!this.isClosed) {
            Buffer buffer = new Buffer(bArr, i11);
            buffer.ptr = i10;
            synchronized (this.buffList) {
                this.buffList.add(buffer);
                this.buffList.notifyAll();
            }
            return;
        }
        throw new IOException("Closed!!");
    }

    public void write(byte[] bArr) {
        if (!this.isClosed) {
            Buffer buffer = new Buffer(bArr, bArr.length);
            synchronized (this.buffList) {
                this.buffList.add(buffer);
                this.buffList.notifyAll();
            }
            return;
        }
        throw new IOException("Closed!!");
    }
}
