package Jb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.k implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f9012Y = new kotlin.jvm.internal.k(3, Gb.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/openai/feature/onboarding/impl/databinding/FragmentContainerBinding;", 0);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        AbstractC3557B.c0("p0", layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.fragment_container, viewGroup, false);
        if (booleanValue) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) inflate;
            return new Gb.a(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }
}
