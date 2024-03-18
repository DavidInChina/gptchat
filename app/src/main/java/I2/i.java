package I2;

import L2.r;
import s2.u;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f7994a;

    /* renamed from: b  reason: collision with root package name */
    public long f7995b;

    public static i a(r rVar, u uVar) {
        rVar.n(uVar.f45193a, 0, 8);
        uVar.F(0);
        return new i(uVar.g(), uVar.l());
    }

    public I8.u b() {
        switch (this.f7994a) {
            case 2:
                I8.u uVar = new I8.u();
                uVar.V(Long.valueOf(this.f7995b), "format_version");
                return uVar;
            case 3:
                I8.u uVar2 = new I8.u();
                uVar2.V(Long.valueOf(this.f7995b), "format_version");
                return uVar2;
            default:
                I8.u uVar3 = new I8.u();
                uVar3.V(Long.valueOf(this.f7995b), "format_version");
                return uVar3;
        }
    }

    public /* synthetic */ i(int i10, int i11) {
        this.f7994a = i10;
        this.f7995b = 2L;
    }

    public /* synthetic */ i(int i10, long j6) {
        this.f7994a = i10;
        this.f7995b = j6;
    }
}
