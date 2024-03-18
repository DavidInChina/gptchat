package ib;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.n;

/* loaded from: classes.dex */
public final class l extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32937Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f32938Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f32939h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f32940i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, AbstractC6216a abstractC6216a, int i10) {
        super(2);
        this.f32939h0 = str;
        this.f32938Z = abstractC6216a;
        this.f32940i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        int i10 = this.f32940i0;
        String str = this.f32939h0;
        AbstractC6216a abstractC6216a = this.f32938Z;
        int i11 = this.f32937Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        A7.b.Q(AbstractC1734s.p(i10 | 1), abstractC1725n, str, abstractC6216a);
                        break;
                    default:
                        L4.a.e(AbstractC1734s.p(i10 | 1), abstractC1725n, str, abstractC6216a);
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        A7.b.Q(AbstractC1734s.p(i10 | 1), abstractC1725n2, str, abstractC6216a);
                        break;
                    default:
                        L4.a.e(AbstractC1734s.p(i10 | 1), abstractC1725n2, str, abstractC6216a);
                        break;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC6216a abstractC6216a, String str, int i10) {
        super(2);
        this.f32938Z = abstractC6216a;
        this.f32939h0 = str;
        this.f32940i0 = i10;
    }
}
