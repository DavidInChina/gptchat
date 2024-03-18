package S4;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f16178a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16179b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16180c;

    /* renamed from: d  reason: collision with root package name */
    public int f16181d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16182e;

    public n(String str, b bVar, int i10) {
        if (bVar != null) {
            if (i10 > 0 && ((i10 - 1) & i10) == 0) {
                this.f16178a = str;
                this.f16179b = bVar;
                this.f16180c = i10;
                this.f16181d = -1;
                this.f16182e = false;
                return;
            }
            throw new IllegalArgumentException("invalid alignment");
        }
        throw new NullPointerException("file == null");
    }

    public abstract int a(f fVar);

    public final int b() {
        int i10 = this.f16181d;
        if (i10 >= 0) {
            return i10;
        }
        throw new RuntimeException("fileOffset not set");
    }

    public abstract Collection c();

    public final void d() {
        if (!this.f16182e) {
            e();
            this.f16182e = true;
            return;
        }
        throw new RuntimeException("already prepared");
    }

    public abstract void e();

    public final void f() {
        if (this.f16182e) {
            return;
        }
        throw new RuntimeException("not prepared");
    }

    public abstract int g();

    public final void h(U4.c cVar) {
        f();
        cVar.a(this.f16180c);
        int i10 = cVar.f17497b;
        int i11 = this.f16181d;
        if (i11 < 0) {
            this.f16181d = i10;
        } else if (i11 != i10) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + i10 + ", but expected " + this.f16181d);
        }
        if (cVar.c()) {
            String str = this.f16178a;
            if (str != null) {
                cVar.b(0, Separators.RETURN + str + ":");
            } else if (i10 != 0) {
                cVar.b(0, Separators.RETURN);
            }
        }
        i(cVar);
    }

    public abstract void i(U4.c cVar);
}
