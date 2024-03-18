package H0;

import android.view.View;
import com.openai.chatgpt.R;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class l1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6970Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z.E0 f6971Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ View f6972h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Z.E0 e02, View view, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6971Z = e02;
        this.f6972h0 = view;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new l1(this.f6971Z, this.f6972h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6970Y;
        jf.y yVar = jf.y.f36177a;
        Z.E0 e02 = this.f6971Z;
        View view = this.f6972h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                this.f6970Y = 1;
                e02.getClass();
                Object n02 = L4.a.n0(e02.f22483t, new AbstractC5163j(2, null), this);
                if (n02 != enumC5000a) {
                    n02 = yVar;
                }
                if (n02 == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (v1.b(view) == e02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return yVar;
        } finally {
            if (v1.b(view) == e02) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
