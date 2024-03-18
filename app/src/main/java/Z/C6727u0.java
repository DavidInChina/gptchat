package z;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: z.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6727u0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51380Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f51381Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51382h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f51383i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6727u0(C6729v0 c6729v0, Object obj, int i10, int i11) {
        super(2);
        this.f51380Y = i11;
        this.f51381Z = c6729v0;
        this.f51382h0 = obj;
        this.f51383i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f51383i0;
        C6729v0 c6729v0 = this.f51381Z;
        Object obj3 = this.f51382h0;
        int i11 = this.f51380Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        c6729v0.a(obj3, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        c6729v0.h(obj3, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        c6729v0.a(obj3, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        c6729v0.h(obj3, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
