package Z1;

import android.content.Context;
import com.openai.feature.widget.impl.WidgetReceiver;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class V extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC1751a0 f22912Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f22913Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22914h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f22915i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22916j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f22917k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1751a0 f22918l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Context f22919m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int[] f22920n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(AbstractC1751a0 abstractC1751a0, Context context, int[] iArr, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22918l0 = abstractC1751a0;
        this.f22919m0 = context;
        this.f22920n0 = iArr;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        V v10 = new V(this.f22918l0, this.f22919m0, this.f22920n0, abstractC4825e);
        v10.f22917k0 = obj;
        return v10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0052 -> B:13:0x0055). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int[] iArr;
        AbstractC1751a0 abstractC1751a0;
        Context context;
        int i10;
        int i11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i12 = this.f22916j0;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f22915i0;
                i10 = this.f22914h0;
                context = this.f22913Z;
                abstractC1751a0 = this.f22912Y;
                iArr = (int[]) this.f22917k0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                i10++;
                if (i10 < i11) {
                    int i13 = iArr[i10];
                    Hc.c cVar = ((WidgetReceiver) abstractC1751a0).f27706b;
                    this.f22917k0 = iArr;
                    this.f22912Y = abstractC1751a0;
                    this.f22913Z = context;
                    this.f22914h0 = i10;
                    this.f22915i0 = i11;
                    this.f22916j0 = 1;
                    if (cVar.a(context, i13, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    i10++;
                    if (i10 < i11) {
                        return jf.y.f36177a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1751a0 abstractC1751a02 = this.f22918l0;
            Context context2 = this.f22919m0;
            AbstractC1751a0.a(abstractC1751a02, (Ng.F) this.f22917k0, context2);
            int[] iArr2 = this.f22920n0;
            iArr = iArr2;
            abstractC1751a0 = abstractC1751a02;
            i11 = iArr2.length;
            context = context2;
            i10 = 0;
            if (i10 < i11) {
            }
        }
    }
}
