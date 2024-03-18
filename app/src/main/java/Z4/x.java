package z4;

import Df.H;
import Ng.F;
import Z.AbstractC1710f0;
import android.content.Context;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Throwable f51725Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f51726Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f51727h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.o f51728i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Context f51729j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ s f51730k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ String f51731l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ String f51732m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ String f51733n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ String f51734o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f51735p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wf.o oVar, Context context, s sVar, String str, String str2, String str3, String str4, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51728i0 = oVar;
        this.f51729j0 = context;
        this.f51730k0 = sVar;
        this.f51731l0 = str;
        this.f51732m0 = str2;
        this.f51733n0 = str3;
        this.f51734o0 = str4;
        this.f51735p0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new x(this.f51728i0, this.f51729j0, this.f51730k0, this.f51731l0, this.f51732m0, this.f51733n0, this.f51734o0, this.f51735p0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (((java.lang.Boolean) r15).booleanValue() == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:7:0x0012, B:22:0x0067, B:24:0x0071, B:27:0x0078, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:37:0x0092, B:40:0x0099, B:42:0x00a2, B:45:0x00ab, B:48:0x00b5, B:49:0x00ba, B:52:0x00cb, B:53:0x00d5, B:56:0x00e9, B:58:0x00f6, B:54:0x00d6, B:57:0x00ec), top: B:67:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:7:0x0012, B:22:0x0067, B:24:0x0071, B:27:0x0078, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:37:0x0092, B:40:0x0099, B:42:0x00a2, B:45:0x00ab, B:48:0x00b5, B:49:0x00ba, B:52:0x00cb, B:53:0x00d5, B:56:0x00e9, B:58:0x00f6, B:54:0x00d6, B:57:0x00ec), top: B:67:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6 A[Catch: all -> 0x00f9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:7:0x0012, B:22:0x0067, B:24:0x0071, B:27:0x0078, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:37:0x0092, B:40:0x0099, B:42:0x00a2, B:45:0x00ab, B:48:0x00b5, B:49:0x00ba, B:52:0x00cb, B:53:0x00d5, B:56:0x00e9, B:58:0x00f6, B:54:0x00d6, B:57:0x00ec), top: B:67:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c8 -> B:52:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00fc -> B:14:0x0030). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int i10;
        String str;
        String str2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f51727h0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = this.f51726Z;
                    th2 = this.f51725Y;
                    try {
                        N.B0(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10++;
                    }
                    C5971a c5971a = (C5971a) obj;
                    q qVar = (q) this.f51735p0.getValue();
                    synchronized (qVar) {
                        AbstractC3557B.c0("composition", c5971a);
                        if (!((Boolean) qVar.f51707i0.getValue()).booleanValue()) {
                            qVar.f51705Z.setValue(c5971a);
                            qVar.f51704Y.b0(c5971a);
                        }
                        if (!((Boolean) ((q) this.f51735p0.getValue()).f51708j0.getValue()).booleanValue()) {
                            if (i10 != 0) {
                                wf.o oVar = this.f51728i0;
                                Integer num = new Integer(i10);
                                AbstractC3557B.Z(th2);
                                this.f51725Y = th2;
                                this.f51726Z = i10;
                                this.f51727h0 = 1;
                                obj = oVar.invoke(num, th2, this);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            Context context = this.f51729j0;
                            s sVar = this.f51730k0;
                            String str3 = this.f51731l0;
                            if (str3 != null && !Lg.n.n2(str3)) {
                                if (!Lg.n.d2(str3, '/')) {
                                    str3 = str3.concat(Separators.SLASH);
                                }
                                str = this.f51732m0;
                                if (str != null && !Lg.n.n2(str)) {
                                    if (Lg.n.d2(str, '/')) {
                                        str = str.concat(Separators.SLASH);
                                    }
                                    str2 = this.f51733n0;
                                    if (!Lg.n.n2(str2) && !Lg.n.I2(str2, Separators.DOT, false)) {
                                        str2 = Separators.DOT.concat(str2);
                                    }
                                    String str4 = str2;
                                    String str5 = this.f51734o0;
                                    this.f51725Y = th2;
                                    this.f51726Z = i10;
                                    this.f51727h0 = 2;
                                    obj = H.k(context, sVar, str3, str, str4, str5, this);
                                    if (obj == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    C5971a c5971a2 = (C5971a) obj;
                                    q qVar2 = (q) this.f51735p0.getValue();
                                    synchronized (qVar2) {
                                    }
                                }
                                str = null;
                                str2 = this.f51733n0;
                                if (!Lg.n.n2(str2)) {
                                    str2 = Separators.DOT.concat(str2);
                                }
                                String str42 = str2;
                                String str52 = this.f51734o0;
                                this.f51725Y = th2;
                                this.f51726Z = i10;
                                this.f51727h0 = 2;
                                obj = H.k(context, sVar, str3, str, str42, str52, this);
                                if (obj == enumC5000a) {
                                }
                                C5971a c5971a22 = (C5971a) obj;
                                q qVar22 = (q) this.f51735p0.getValue();
                                synchronized (qVar22) {
                                }
                            }
                            str3 = null;
                            str = this.f51732m0;
                            if (str != null) {
                                if (Lg.n.d2(str, '/')) {
                                }
                                str2 = this.f51733n0;
                                if (!Lg.n.n2(str2)) {
                                }
                                String str422 = str2;
                                String str522 = this.f51734o0;
                                this.f51725Y = th2;
                                this.f51726Z = i10;
                                this.f51727h0 = 2;
                                obj = H.k(context, sVar, str3, str, str422, str522, this);
                                if (obj == enumC5000a) {
                                }
                                C5971a c5971a222 = (C5971a) obj;
                                q qVar222 = (q) this.f51735p0.getValue();
                                synchronized (qVar222) {
                                }
                            }
                            str = null;
                            str2 = this.f51733n0;
                            if (!Lg.n.n2(str2)) {
                            }
                            String str4222 = str2;
                            String str5222 = this.f51734o0;
                            this.f51725Y = th2;
                            this.f51726Z = i10;
                            this.f51727h0 = 2;
                            obj = H.k(context, sVar, str3, str, str4222, str5222, this);
                            if (obj == enumC5000a) {
                            }
                            C5971a c5971a2222 = (C5971a) obj;
                            q qVar2222 = (q) this.f51735p0.getValue();
                            synchronized (qVar2222) {
                            }
                        }
                        if (!((Boolean) ((q) this.f51735p0.getValue()).f51707i0.getValue()).booleanValue() && th2 != null) {
                            ((q) this.f51735p0.getValue()).b(th2);
                        }
                        return y.f36177a;
                    }
                    if (!((Boolean) ((q) this.f51735p0.getValue()).f51708j0.getValue()).booleanValue()) {
                    }
                    if (!((Boolean) ((q) this.f51735p0.getValue()).f51707i0.getValue()).booleanValue()) {
                        ((q) this.f51735p0.getValue()).b(th2);
                    }
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f51726Z;
            th2 = this.f51725Y;
            N.B0(obj);
        } else {
            N.B0(obj);
            i10 = 0;
            th2 = null;
            if (!((Boolean) ((q) this.f51735p0.getValue()).f51708j0.getValue()).booleanValue()) {
            }
            if (!((Boolean) ((q) this.f51735p0.getValue()).f51707i0.getValue()).booleanValue()) {
            }
            return y.f36177a;
        }
    }
}
