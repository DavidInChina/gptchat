package B9;

import Lg.n;
import android.app.assist.AssistStructure;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final j9.g f2005a = new j9.g(2);

    public static void a(AssistStructure.ViewNode viewNode, ArrayList arrayList, int i10, int i11) {
        String m22;
        String str;
        String str2;
        CharSequence contentDescription;
        CharSequence text = viewNode.getText();
        if ((text != null && !n.n2(text)) || (((contentDescription = viewNode.getContentDescription()) != null && !n.n2(contentDescription)) || viewNode.isSelected() || viewNode.isChecked() || viewNode.isFocused() || viewNode.isActivated() || viewNode.isCheckable() || viewNode.isClickable())) {
            String className = viewNode.getClassName();
            if (className == null) {
                m22 = "";
            } else {
                List F22 = n.F2(className, new char[]{'.'});
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(F22, 10));
                int i12 = 0;
                for (Object obj : F22) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        String str3 = (String) obj;
                        if (i12 < F22.size() - 1) {
                            str3 = String.valueOf(str3.charAt(0));
                        }
                        arrayList2.add(str3);
                        i12 = i13;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
                m22 = t.m2(arrayList2, Separators.DOT, null, null, null, 62);
            }
            String str4 = m22;
            CharSequence text2 = viewNode.getText();
            if (text2 != null) {
                str = text2.toString();
            } else {
                str = null;
            }
            CharSequence contentDescription2 = viewNode.getContentDescription();
            if (contentDescription2 != null) {
                str2 = contentDescription2.toString();
            } else {
                str2 = null;
            }
            arrayList.add(new c(str4, viewNode.getTop() + i10, str, i11 + viewNode.getLeft(), str2));
        }
        int childCount = viewNode.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            AssistStructure.ViewNode childAt = viewNode.getChildAt(i14);
            AbstractC3557B.b0("getChildAt(...)", childAt);
            a(childAt, arrayList, viewNode.getTop() + i10, viewNode.getLeft() + i10);
        }
    }
}
