package D1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f3243d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f3244a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f3245b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f3246c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f3244a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a5 = a(viewGroup.getChildAt(childCount));
                    if (a5 != null) {
                        return a5;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                AbstractC2469q0.p(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
