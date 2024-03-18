package D3;

import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import r.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f3336e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3337a;

    /* renamed from: b  reason: collision with root package name */
    public final File f3338b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f3339c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f3340d;

    public a(String str, File file, boolean z10) {
        File file2;
        Lock lock;
        this.f3337a = z10;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f3338b = file2;
        HashMap hashMap = f3336e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3339c = lock;
    }

    public final void a(boolean z10) {
        this.f3339c.lock();
        if (z10) {
            File file = this.f3338b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = f.p(new FileOutputStream(file), file).getChannel();
                    channel.lock();
                    this.f3340d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e10) {
                this.f3340d = null;
                AbstractC3612c.s("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3340d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3339c.unlock();
    }
}
