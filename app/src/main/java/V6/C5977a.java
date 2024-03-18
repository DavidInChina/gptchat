package v6;

import K4.J;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import w3.L;
import w3.Y;

/* renamed from: v6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5977a {
    public static void a(View view, LinkedHashMap linkedHashMap) {
        String str;
        RecyclerView recyclerView;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) && view != null && (view.getLayoutParams() instanceof L)) {
                RecyclerView recyclerView2 = (RecyclerView) parent;
                Y I10 = RecyclerView.I(view);
                int i10 = -1;
                if (I10 != null && (recyclerView = I10.f47817r) != null) {
                    i10 = recyclerView.F(I10);
                }
                linkedHashMap.put("action.target.parent.index", Integer.valueOf(i10));
                linkedHashMap.put("action.target.parent.classname", parent.getClass().getCanonicalName());
                View view2 = (View) parent;
                try {
                    str = view2.getResources().getResourceEntryName(view2.getId());
                    if (str == null) {
                        int id2 = view2.getId();
                        J.j(16);
                        String num = Integer.toString(id2, 16);
                        AbstractC3557B.b0("toString(this, checkRadix(radix))", num);
                        str = "0x".concat(num);
                    }
                } catch (Resources.NotFoundException unused) {
                    int id3 = view2.getId();
                    J.j(16);
                    String num2 = Integer.toString(id3, 16);
                    AbstractC3557B.b0("toString(this, checkRadix(radix))", num2);
                    str = "0x".concat(num2);
                }
                linkedHashMap.put("action.target.parent.resource_id", str);
                return;
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (AbstractC3557B.K(C5977a.class, cls)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C5977a.class.hashCode();
    }
}
