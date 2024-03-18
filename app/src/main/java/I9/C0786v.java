package I9;

import id.AbstractC3557B;

/* renamed from: I9.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786v extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8456Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8457Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0775p f8458h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786v(AbstractC0775p abstractC0775p, wf.k kVar) {
        super(1);
        this.f8458h0 = abstractC0775p;
        this.f8457Z = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f8456Y;
        wf.k kVar = this.f8457Z;
        AbstractC0775p abstractC0775p = this.f8458h0;
        switch (i10) {
            case 0:
                long j6 = ((Z0.i) obj).f22799a;
                String str = ((J0) abstractC0775p).f8187a.f26375b;
                if (str != null) {
                    kVar.invoke(new C0783t0(str));
                }
                return yVar;
            default:
                String str2 = (String) obj;
                AbstractC3557B.c0("it", str2);
                kVar.invoke(new E0(((J0) abstractC0775p).f8187a, str2));
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786v(wf.k kVar, AbstractC0775p abstractC0775p) {
        super(1);
        this.f8457Z = kVar;
        this.f8458h0 = abstractC0775p;
    }
}
