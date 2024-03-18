package ke;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.B;
import io.ktor.utils.io.u;
import java.io.Closeable;
import jf.y;
import ji.AbstractC4137l;
import kotlin.jvm.internal.z;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5761e;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Closeable f37412Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC4831k f37413Z;

    /* renamed from: h0  reason: collision with root package name */
    public C5761e f37414h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC4137l f37415i0;

    /* renamed from: j0  reason: collision with root package name */
    public z f37416j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f37417k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f37418l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4137l f37419m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4831k f37420n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ C5761e f37421o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC4137l abstractC4137l, AbstractC4831k abstractC4831k, C5761e c5761e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37419m0 = abstractC4137l;
        this.f37420n0 = abstractC4831k;
        this.f37421o0 = c5761e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        m mVar = new m(this.f37419m0, this.f37420n0, this.f37421o0, abstractC4825e);
        mVar.f37418l0 = obj;
        return mVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x001e, TryCatch #2 {all -> 0x001e, blocks: (B:6:0x001a, B:11:0x0031, B:13:0x003d, B:15:0x0043, B:17:0x0049, B:19:0x004d, B:22:0x0070), top: B:40:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:22:0x0070). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y yVar;
        B b10;
        AbstractC4831k abstractC4831k;
        C5761e c5761e;
        AbstractC4137l abstractC4137l;
        AbstractC4137l abstractC4137l2;
        z zVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37417k0;
        y yVar2 = y.f36177a;
        Throwable th2 = null;
        try {
        } catch (Throwable th3) {
            if (abstractC4137l2 != null) {
                try {
                    abstractC4137l2.close();
                } catch (Throwable th4) {
                    P4.a.m(th3, th4);
                }
            }
            th2 = th3;
            yVar = null;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                z zVar2 = this.f37416j0;
                abstractC4137l = this.f37415i0;
                c5761e = this.f37414h0;
                abstractC4831k = this.f37413Z;
                ?? r82 = this.f37412Y;
                b10 = (B) this.f37418l0;
                N.B0(obj);
                z zVar3 = zVar2;
                AbstractC4137l abstractC4137l3 = r82;
                ((io.ktor.utils.io.t) b10.f33365Y).o(1);
                zVar = zVar3;
                abstractC4137l2 = abstractC4137l3;
                if (!abstractC4137l.isOpen() && Ad.l.G0(abstractC4831k) && zVar.f37647Y >= 0) {
                    u uVar = b10.f33365Y;
                    C6.a aVar = new C6.a(zVar, abstractC4137l, c5761e, 25);
                    this.f37418l0 = b10;
                    this.f37412Y = abstractC4137l2;
                    this.f37413Z = abstractC4831k;
                    this.f37414h0 = c5761e;
                    this.f37415i0 = abstractC4137l;
                    this.f37416j0 = zVar;
                    this.f37417k0 = 1;
                    io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) uVar;
                    tVar.getClass();
                    zVar3 = zVar;
                    abstractC4137l3 = abstractC4137l2;
                    if (io.ktor.utils.io.t.V(tVar, 1, aVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    ((io.ktor.utils.io.t) b10.f33365Y).o(1);
                    zVar = zVar3;
                    abstractC4137l2 = abstractC4137l3;
                    if (!abstractC4137l.isOpen()) {
                    }
                    if (abstractC4137l2 != null) {
                    }
                    yVar = yVar2;
                    if (th2 == null) {
                    }
                } else {
                    if (abstractC4137l2 != null) {
                        try {
                            abstractC4137l2.close();
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    }
                    yVar = yVar2;
                    if (th2 == null) {
                        AbstractC3557B.Z(yVar);
                        return yVar2;
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            B b11 = (B) this.f37418l0;
            AbstractC4137l abstractC4137l4 = this.f37419m0;
            ?? obj2 = new Object();
            AbstractC4831k abstractC4831k2 = this.f37420n0;
            c5761e = this.f37421o0;
            b10 = b11;
            abstractC4831k = abstractC4831k2;
            abstractC4137l = abstractC4137l4;
            zVar = obj2;
            abstractC4137l2 = abstractC4137l4;
            if (!abstractC4137l.isOpen()) {
            }
            if (abstractC4137l2 != null) {
            }
            yVar = yVar2;
            if (th2 == null) {
            }
        }
    }
}
