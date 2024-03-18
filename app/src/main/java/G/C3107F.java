package g;

import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* renamed from: g.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3107F extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3107F f30937Z = new C3107F(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3107F f30938h0 = new C3107F(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30939Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3107F(int i10) {
        super(1);
        this.f30939Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f30939Y) {
            case 0:
                View view = (View) obj;
                AbstractC3557B.c0("it", view);
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                View view2 = (View) obj;
                AbstractC3557B.c0("it", view2);
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (!(tag instanceof AbstractC3106E)) {
                    return null;
                }
                return (AbstractC3106E) tag;
        }
    }
}
