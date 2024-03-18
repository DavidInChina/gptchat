package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final f0 f25365Z = new f0(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final f0 f25366h0 = new f0(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final f0 f25367i0 = new f0(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final f0 f25368j0 = new f0(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25369Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i10) {
        super(1);
        this.f25369Y = i10;
    }

    public final View a(View view) {
        switch (this.f25369Y) {
            case 0:
                AbstractC3557B.c0("currentView", view);
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                AbstractC3557B.c0("view", view);
                ViewParent parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    return null;
                }
                return (View) parent2;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f25369Y) {
            case 0:
                return a((View) obj);
            case 1:
                View view = (View) obj;
                AbstractC3557B.c0("viewParent", view);
                Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
                if (!(tag instanceof AbstractC2086v)) {
                    return null;
                }
                return (AbstractC2086v) tag;
            case 2:
                return a((View) obj);
            default:
                View view2 = (View) obj;
                AbstractC3557B.c0("view", view2);
                Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (!(tag2 instanceof e0)) {
                    return null;
                }
                return (e0) tag2;
        }
    }
}
