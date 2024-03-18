package H2;

import p2.o0;
import s2.AbstractC5530A;
import y2.j0;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f7337a;

    /* renamed from: b  reason: collision with root package name */
    public final j0[] f7338b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f7339c;

    /* renamed from: d  reason: collision with root package name */
    public final o0 f7340d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7341e;

    public w(j0[] j0VarArr, s[] sVarArr, o0 o0Var, u uVar) {
        this.f7338b = j0VarArr;
        this.f7339c = (s[]) sVarArr.clone();
        this.f7340d = o0Var;
        this.f7341e = uVar;
        this.f7337a = j0VarArr.length;
    }

    public final boolean a(w wVar, int i10) {
        if (wVar == null || !AbstractC5530A.a(this.f7338b[i10], wVar.f7338b[i10]) || !AbstractC5530A.a(this.f7339c[i10], wVar.f7339c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f7338b[i10] != null) {
            return true;
        }
        return false;
    }
}
