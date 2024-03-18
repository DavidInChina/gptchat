package Fe;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.z;
import java.io.Closeable;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Closeable f5300Y;

    /* renamed from: Z  reason: collision with root package name */
    public z f5301Z;

    /* renamed from: h0  reason: collision with root package name */
    public z f5302h0;

    /* renamed from: i0  reason: collision with root package name */
    public io.ktor.utils.io.x f5303i0;

    /* renamed from: j0  reason: collision with root package name */
    public Me.d f5304j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f5305k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f5306l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.x f5307m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ z f5308n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ z f5309o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.ktor.utils.io.x xVar, z zVar, z zVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5307m0 = xVar;
        this.f5308n0 = zVar;
        this.f5309o0 = zVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f5307m0, this.f5308n0, this.f5309o0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:26|(1:28)|29|30|61|31|(1:33)(3:34|35|(1:37)(9:38|42|20|(2:22|24)|43|(0)|45|48|49))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r11 = r7;
        r12 = r9;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x004f, TryCatch #7 {all -> 0x004f, blocks: (B:16:0x0049, B:20:0x0055, B:22:0x005e, B:24:0x0067, B:26:0x0070, B:29:0x0088, B:42:0x00e2, B:43:0x0105, B:46:0x0114, B:30:0x008b, B:41:0x00d3), top: B:59:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x004f, blocks: (B:16:0x0049, B:20:0x0055, B:22:0x005e, B:24:0x0067, B:26:0x0070, B:29:0x0088, B:42:0x00e2, B:43:0x0105, B:46:0x0114, B:30:0x008b, B:41:0x00d3), top: B:59:0x0049 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cb -> B:42:0x00e2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d3 -> B:42:0x00e2). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        z zVar;
        z zVar2;
        io.ktor.utils.io.x xVar;
        Throwable th2;
        Closeable closeable2;
        z zVar3;
        z zVar4;
        io.ktor.utils.io.x xVar2;
        Me.d dVar;
        int i10;
        Me.d V10;
        Object obj2;
        Me.d V11;
        io.ktor.utils.io.t tVar;
        Throwable q10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f5306l0;
        io.ktor.utils.io.x xVar3 = this.f5307m0;
        z zVar5 = this.f5309o0;
        z zVar6 = this.f5308n0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        xVar = this.f5303i0;
                        zVar2 = this.f5302h0;
                        zVar = this.f5301Z;
                        closeable = this.f5300Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            ((io.ktor.utils.io.t) xVar).h(th2);
                            ((io.ktor.utils.io.t) zVar).j(th2);
                            ((io.ktor.utils.io.t) zVar2).j(th2);
                            closeable.close();
                            if (((io.ktor.utils.io.t) xVar3).r()) {
                            }
                            q10 = ((io.ktor.utils.io.t) xVar3).q();
                            if (q10 != null) {
                            }
                            return jf.y.f36177a;
                        }
                        closeable.close();
                        if (((io.ktor.utils.io.t) xVar3).r() && (!((io.ktor.utils.io.t) zVar6).s() || !((io.ktor.utils.io.t) zVar5).s())) {
                            this.f5300Y = null;
                            this.f5301Z = null;
                            this.f5302h0 = null;
                            this.f5303i0 = null;
                            this.f5304j0 = null;
                            this.f5306l0 = 1;
                            obj2 = ((io.ktor.utils.io.t) xVar3).C(4096L, this);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            closeable = (Closeable) obj2;
                            dVar = (Me.d) closeable;
                            V11 = dVar.V();
                            this.f5300Y = closeable;
                            this.f5301Z = zVar6;
                            this.f5302h0 = zVar5;
                            this.f5303i0 = xVar3;
                            this.f5304j0 = dVar;
                            this.f5305k0 = 0;
                            this.f5306l0 = 2;
                            tVar = (io.ktor.utils.io.t) zVar6;
                            if (tVar.b0(V11, this) != enumC5000a) {
                                return enumC5000a;
                            }
                            i10 = 0;
                            zVar4 = zVar5;
                            closeable2 = closeable;
                            zVar3 = tVar;
                            xVar2 = xVar3;
                            V10 = dVar.V();
                            this.f5300Y = closeable2;
                            this.f5301Z = zVar3;
                            this.f5302h0 = zVar4;
                            this.f5303i0 = xVar2;
                            this.f5304j0 = null;
                            this.f5305k0 = i10;
                            this.f5306l0 = 3;
                            if (((io.ktor.utils.io.t) zVar4).b0(V10, this) != enumC5000a) {
                                return enumC5000a;
                            }
                            closeable = closeable2;
                            closeable.close();
                            if (((io.ktor.utils.io.t) xVar3).r()) {
                            }
                            q10 = ((io.ktor.utils.io.t) xVar3).q();
                            if (q10 != null) {
                            }
                            return jf.y.f36177a;
                        }
                        q10 = ((io.ktor.utils.io.t) xVar3).q();
                        if (q10 != null) {
                            throw q10;
                        }
                        return jf.y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f5305k0;
                dVar = this.f5304j0;
                xVar2 = this.f5303i0;
                zVar4 = this.f5302h0;
                zVar3 = this.f5301Z;
                closeable2 = this.f5300Y;
                try {
                    N.B0(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    xVar = xVar2;
                    zVar2 = zVar4;
                    zVar = zVar3;
                    closeable = closeable2;
                    ((io.ktor.utils.io.t) xVar).h(th2);
                    ((io.ktor.utils.io.t) zVar).j(th2);
                    ((io.ktor.utils.io.t) zVar2).j(th2);
                    closeable.close();
                    if (((io.ktor.utils.io.t) xVar3).r()) {
                    }
                    q10 = ((io.ktor.utils.io.t) xVar3).q();
                    if (q10 != null) {
                    }
                    return jf.y.f36177a;
                }
                V10 = dVar.V();
                this.f5300Y = closeable2;
                this.f5301Z = zVar3;
                this.f5302h0 = zVar4;
                this.f5303i0 = xVar2;
                this.f5304j0 = null;
                this.f5305k0 = i10;
                this.f5306l0 = 3;
                if (((io.ktor.utils.io.t) zVar4).b0(V10, this) != enumC5000a) {
                }
            } else {
                try {
                    N.B0(obj);
                    obj2 = obj;
                    closeable = (Closeable) obj2;
                    dVar = (Me.d) closeable;
                    V11 = dVar.V();
                    this.f5300Y = closeable;
                    this.f5301Z = zVar6;
                    this.f5302h0 = zVar5;
                    this.f5303i0 = xVar3;
                    this.f5304j0 = dVar;
                    this.f5305k0 = 0;
                    this.f5306l0 = 2;
                    tVar = (io.ktor.utils.io.t) zVar6;
                    if (tVar.b0(V11, this) != enumC5000a) {
                    }
                } catch (Throwable th5) {
                    try {
                        ((io.ktor.utils.io.t) zVar6).j(th5);
                        ((io.ktor.utils.io.t) zVar5).j(th5);
                    } finally {
                        P4.a.y(zVar6);
                        P4.a.y(zVar5);
                    }
                }
            }
        } else {
            N.B0(obj);
            if (((io.ktor.utils.io.t) xVar3).r()) {
            }
            q10 = ((io.ktor.utils.io.t) xVar3).q();
            if (q10 != null) {
            }
            return jf.y.f36177a;
        }
    }
}
