package A3;

import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class g extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final g f647Z = new g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final g f648h0 = new g(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f649Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f649Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f649Y) {
            case 0:
                View view = (View) obj;
                AbstractC3557B.c0("view", view);
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                View view2 = (View) obj;
                AbstractC3557B.c0("view", view2);
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (!(tag instanceof f)) {
                    return null;
                }
                return (f) tag;
        }
    }
}
