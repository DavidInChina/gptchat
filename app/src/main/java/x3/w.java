package x3;

import android.database.sqlite.SQLiteProgram;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public class w implements B3.g {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48731Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f48732Z;

    public w(SQLiteProgram sQLiteProgram) {
        AbstractC3557B.c0("delegate", sQLiteProgram);
        this.f48732Z = sQLiteProgram;
    }

    @Override // B3.g
    public final void D(int i10, double d10) {
        switch (this.f48731Y) {
            case 0:
                a(i10, Double.valueOf(d10));
                return;
            default:
                ((SQLiteProgram) this.f48732Z).bindDouble(i10, d10);
                return;
        }
    }

    @Override // B3.g
    public final void T(int i10, long j6) {
        switch (this.f48731Y) {
            case 0:
                a(i10, Long.valueOf(j6));
                return;
            default:
                ((SQLiteProgram) this.f48732Z).bindLong(i10, j6);
                return;
        }
    }

    public final void a(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        Object obj2 = this.f48732Z;
        if (i11 >= ((List) obj2).size() && (size = ((List) obj2).size()) <= i11) {
            while (true) {
                ((List) obj2).add(null);
                if (size == i11) {
                    break;
                }
                size++;
            }
        }
        ((List) obj2).set(i11, obj);
    }

    @Override // B3.g
    public final void b(int i10, String str) {
        switch (this.f48731Y) {
            case 0:
                AbstractC3557B.c0("value", str);
                a(i10, str);
                return;
            default:
                AbstractC3557B.c0("value", str);
                ((SQLiteProgram) this.f48732Z).bindString(i10, str);
                return;
        }
    }

    @Override // B3.g
    public final void b0(int i10, byte[] bArr) {
        switch (this.f48731Y) {
            case 0:
                a(i10, bArr);
                return;
            default:
                ((SQLiteProgram) this.f48732Z).bindBlob(i10, bArr);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f48731Y) {
            case 0:
                return;
            default:
                ((SQLiteProgram) this.f48732Z).close();
                return;
        }
    }

    @Override // B3.g
    public final void s0(int i10) {
        switch (this.f48731Y) {
            case 0:
                a(i10, null);
                return;
            default:
                ((SQLiteProgram) this.f48732Z).bindNull(i10);
                return;
        }
    }
}
