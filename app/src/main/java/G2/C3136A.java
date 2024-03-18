package g2;

import Qg.AbstractC1207j;
import Qg.l0;
import Z.E0;
import Z.EnumC1747y0;
import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: g2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3136A implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC3155m f31016Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0 f31017Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f31018h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ l0 f31019i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31020j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ X1.j f31021k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ L f31022l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31023m0;

    public C3136A(AbstractC3155m abstractC3155m, E0 e02, kotlin.jvm.internal.A a5, l0 l0Var, SessionWorker sessionWorker, X1.j jVar, L l10, Ng.F f6) {
        this.f31016Y = abstractC3155m;
        this.f31017Z = e02;
        this.f31018h0 = a5;
        this.f31019i0 = l0Var;
        this.f31020j0 = sessionWorker;
        this.f31021k0 = jVar;
        this.f31022l0 = l10;
        this.f31023m0 = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(EnumC1747y0 enumC1747y0, AbstractC4825e abstractC4825e) {
        z zVar;
        EnumC5000a enumC5000a;
        int i10;
        C3136A c3136a;
        Boolean bool;
        if (abstractC4825e instanceof z) {
            zVar = (z) abstractC4825e;
            int i11 = zVar.f31161i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar.f31161i0 = i11 - Integer.MIN_VALUE;
                Object obj = zVar.f31159Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = zVar.f31161i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c3136a = zVar.f31158Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            c3136a.f31022l0.b(c3136a.f31020j0.f25280o0.f31044a);
                            c3136a.f31018h0.f37621Y = c3136a.f31017Z.f22464a;
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3136a = zVar.f31158Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    int ordinal = enumC1747y0.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 4) {
                            if (this.f31017Z.f22464a <= this.f31018h0.f37621Y && ((Boolean) this.f31019i0.getValue()).booleanValue()) {
                                c3136a = this;
                                c3136a.f31018h0.f37621Y = c3136a.f31017Z.f22464a;
                            } else {
                                zVar.f31158Y = this;
                                zVar.f31161i0 = 1;
                                obj = this.f31016Y.a(this.f31020j0.f10725Y, (X1.j) this.f31021k0.a(), zVar);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                c3136a = this;
                            }
                        }
                    } else {
                        Ad.l.P(this.f31023m0, null);
                    }
                    return jf.y.f36177a;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!((Boolean) c3136a.f31019i0.getValue()).booleanValue() && booleanValue) {
                    bool = Boolean.TRUE;
                    zVar.f31158Y = c3136a;
                    zVar.f31161i0 = 2;
                    if (c3136a.f31019i0.c(bool, zVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    c3136a.f31022l0.b(c3136a.f31020j0.f25280o0.f31044a);
                }
                c3136a.f31018h0.f37621Y = c3136a.f31017Z.f22464a;
                return jf.y.f36177a;
            }
        }
        zVar = new z(this, abstractC4825e);
        Object obj2 = zVar.f31159Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = zVar.f31161i0;
        if (i10 == 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (!((Boolean) c3136a.f31019i0.getValue()).booleanValue()) {
            bool = Boolean.TRUE;
            zVar.f31158Y = c3136a;
            zVar.f31161i0 = 2;
            if (c3136a.f31019i0.c(bool, zVar) == enumC5000a) {
            }
            c3136a.f31022l0.b(c3136a.f31020j0.f25280o0.f31044a);
        }
        c3136a.f31018h0.f37621Y = c3136a.f31017Z.f22464a;
        return jf.y.f36177a;
    }
}
