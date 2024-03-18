package H0;

import android.os.Parcel;
import android.util.Base64;

/* renamed from: H0.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0703s0 {

    /* renamed from: a  reason: collision with root package name */
    public Parcel f7033a;

    public C0703s0(String str) {
        Parcel obtain = Parcel.obtain();
        this.f7033a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public long a() {
        long j6;
        Parcel parcel = this.f7033a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j6 = 4294967296L;
        } else if (readByte == 2) {
            j6 = 8589934592L;
        } else {
            j6 = 0;
        }
        if (Z0.o.a(j6, 0L)) {
            Z0.o[] oVarArr = Z0.n.f22809b;
            return Z0.n.f22810c;
        }
        return M3.H.b0(parcel.readFloat(), j6);
    }

    public void b(byte b10) {
        this.f7033a.writeByte(b10);
    }

    public void c(float f6) {
        this.f7033a.writeFloat(f6);
    }

    public void d(long j6) {
        long b10 = Z0.n.b(j6);
        byte b11 = 0;
        if (!Z0.o.a(b10, 0L)) {
            if (Z0.o.a(b10, 4294967296L)) {
                b11 = 1;
            } else if (Z0.o.a(b10, 8589934592L)) {
                b11 = 2;
            }
        }
        b(b11);
        if (!Z0.o.a(Z0.n.b(j6), 0L)) {
            c(Z0.n.c(j6));
        }
    }
}
