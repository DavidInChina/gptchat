package u3;

import com.google.android.gms.internal.play_billing.N;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: u3.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5835h {

    /* renamed from: a  reason: collision with root package name */
    public final int f46371a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46372b;

    /* renamed from: c  reason: collision with root package name */
    public final long f46373c;

    /* renamed from: d  reason: collision with root package name */
    public final long f46374d;

    public C5835h(int i10, int i11, long j6, long j10) {
        this.f46371a = i10;
        this.f46372b = i11;
        this.f46373c = j6;
        this.f46374d = j10;
    }

    public static C5835h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(N.t(new FileInputStream(file), file));
        try {
            C5835h c5835h = new C5835h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c5835h;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(r.f.p(new FileOutputStream(file), file));
        try {
            dataOutputStream.writeInt(this.f46371a);
            dataOutputStream.writeInt(this.f46372b);
            dataOutputStream.writeLong(this.f46373c);
            dataOutputStream.writeLong(this.f46374d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5835h)) {
            return false;
        }
        C5835h c5835h = (C5835h) obj;
        if (this.f46372b == c5835h.f46372b && this.f46373c == c5835h.f46373c && this.f46371a == c5835h.f46371a && this.f46374d == c5835h.f46374d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46372b), Long.valueOf(this.f46373c), Integer.valueOf(this.f46371a), Long.valueOf(this.f46374d));
    }
}
