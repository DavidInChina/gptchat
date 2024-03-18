package G3;

import D1.Z;
import android.view.ViewGroup;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import w.C6049A;
import w.C6059f;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final C0597a f5969a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f5970b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f5971c = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [G3.x, G3.a] */
    static {
        ?? xVar = new x();
        xVar.f5974D0 = false;
        xVar.I(new C0605i(2));
        xVar.I(new s());
        xVar.I(new C0605i(1));
        f5969a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [G3.u, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, s sVar) {
        ArrayList arrayList = f5971c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = Z.f3247a;
            if (D1.K.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (sVar == null) {
                    sVar = f5969a;
                }
                s clone = sVar.clone();
                ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).v(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.i(viewGroup, true);
                }
                AbstractC2469q0.p(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    ?? obj = new Object();
                    obj.f5967Y = clone;
                    obj.f5968Z = viewGroup;
                    viewGroup.addOnAttachStateChangeListener(obj);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w.A, w.f] */
    public static C6059f b() {
        C6059f c6059f;
        ThreadLocal threadLocal = f5970b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c6059f = (C6059f) weakReference.get()) != null) {
            return c6059f;
        }
        ?? c6049a = new C6049A();
        threadLocal.set(new WeakReference(c6049a));
        return c6049a;
    }
}
