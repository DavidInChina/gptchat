package U;

import Z0.p;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class k implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final wf.k f17356Y;

    /* renamed from: Z  reason: collision with root package name */
    public final wf.n f17357Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f17358h0;

    public k(h hVar, i iVar, boolean z10) {
        this.f17356Y = hVar;
        this.f17357Z = iVar;
        this.f17358h0 = z10;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        if (!this.f17358h0) {
            int i11 = C5251c.f43622e;
            return C5251c.f43619b;
        } else if (Ad.l.k0(i10, 1) && C5251c.e(j6) < 0.0f) {
            return R4.b.r(0.0f, ((Number) this.f17356Y.invoke(Float.valueOf(C5251c.e(j6)))).floatValue());
        } else {
            int i12 = C5251c.f43622e;
            return C5251c.f43619b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f17355h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f17355h0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f17353Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f17355h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Float f6 = new Float(p.c(j6));
                    jVar.f17355h0 = 1;
                    obj = this.f17357Z.invoke(f6, jVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return new p(AbstractC4828h.l(0.0f, ((Number) obj).floatValue()));
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f17353Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f17355h0;
        if (i10 == 0) {
        }
        return new p(AbstractC4828h.l(0.0f, ((Number) obj2).floatValue()));
    }

    @Override // A0.a
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        return new p(p.f22813b);
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        if (!this.f17358h0) {
            int i11 = C5251c.f43622e;
            return C5251c.f43619b;
        } else if (Ad.l.k0(i10, 1) && C5251c.e(j10) > 0.0f) {
            return R4.b.r(0.0f, ((Number) this.f17356Y.invoke(Float.valueOf(C5251c.e(j10)))).floatValue());
        } else {
            int i12 = C5251c.f43622e;
            return C5251c.f43619b;
        }
    }
}
