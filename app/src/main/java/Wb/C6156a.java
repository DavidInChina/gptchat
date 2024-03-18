package wb;

import B.A0;
import Vc.q;
import Vc.r;
import Vc.w;
import Vc.x;
import b9.o;
import com.google.android.gms.internal.play_billing.N;
import java.util.Map;
import jf.y;
import nd.l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6205s;
import wf.p;
import x8.W;
import xb.C6390c;

/* renamed from: wb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6156a extends AbstractC5163j implements p {

    /* renamed from: Y  reason: collision with root package name */
    public int f48276Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ boolean f48277Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f48278h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6390c f48279i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C6158c f48280j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f48281k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6156a(l lVar, C6390c c6390c, C6158c c6158c, boolean z10, AbstractC4825e abstractC4825e) {
        super(4, abstractC4825e);
        this.f48278h0 = lVar;
        this.f48279i0 = c6390c;
        this.f48280j0 = c6158c;
        this.f48281k0 = z10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C6205s c6205s = (C6205s) obj2;
        Map map = (Map) obj3;
        C6156a c6156a = new C6156a(this.f48278h0, this.f48279i0, this.f48280j0, this.f48281k0, (AbstractC4825e) obj4);
        c6156a.f48277Z = booleanValue;
        return c6156a.invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x xVar;
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f48276Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        N.B0(obj);
                        return y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    C6158c c6158c = this.f48280j0;
                    e eVar = c6158c.f48285b;
                    A0 a02 = new A0(c6158c, (Sc.w) ((w) xVar).f18565a, this.f48281k0, 5);
                    this.f48276Y = 3;
                    if (eVar.b(a02, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (xVar instanceof r) {
                    W.W(Pc.e.a(), "Error fetching models", ((r) xVar).f18561a, null, 4);
                } else if (!(xVar instanceof q)) {
                    throw new RuntimeException();
                }
                return y.f36177a;
            }
            z10 = this.f48277Z;
            N.B0(obj);
        } else {
            N.B0(obj);
            z10 = this.f48277Z;
            this.f48277Z = z10;
            this.f48276Y = 1;
            obj = ((o) this.f48278h0).a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f48276Y = 2;
            obj = this.f48279i0.a(z10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            xVar = (x) obj;
            if (!(xVar instanceof w)) {
            }
        }
        return y.f36177a;
    }
}
