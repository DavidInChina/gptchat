package eb;

import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import jf.y;
import ld.C4428a;
import nd.AbstractC4815d;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.Q;
import xd.h;

/* renamed from: eb.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2827c implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final u9.b f29108a;

    /* renamed from: b  reason: collision with root package name */
    public final t f29109b;

    /* renamed from: c  reason: collision with root package name */
    public final h f29110c;

    /* renamed from: d  reason: collision with root package name */
    public final C4428a f29111d;

    public C2827c(u9.b bVar, t tVar, h hVar, C4428a c4428a) {
        this.f29108a = bVar;
        this.f29109b = tVar;
        this.f29110c = hVar;
        this.f29111d = c4428a;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C2825a c2825a;
        Object obj;
        int i10;
        C2827c c2827c;
        if (abstractC4825e instanceof C2825a) {
            c2825a = (C2825a) abstractC4825e;
            int i11 = c2825a.f29105i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2825a.f29105i0 = i11 - Integer.MIN_VALUE;
                obj = c2825a.f29103Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c2825a.f29105i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2827c = c2825a.f29102Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ExperimentKey.HapticsDisabled hapticsDisabled = ExperimentKey.HapticsDisabled.INSTANCE;
                    c2825a.f29102Y = this;
                    c2825a.f29105i0 = 1;
                    G g10 = (G) this.f29109b;
                    g10.getClass();
                    obj = G.d(g10, hapticsDisabled, c2825a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c2827c = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    L4.a.E0(L4.a.I0(new C2826b(c2827c, null), ((Q) c2827c.f29110c).f44819b), c2827c.f29111d);
                }
                return y.f36177a;
            }
        }
        c2825a = new C2825a(this, abstractC4825e);
        obj = c2825a.f29103Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c2825a.f29105i0;
        if (i10 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return y.f36177a;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Ng.Q.f12904a;
    }
}
