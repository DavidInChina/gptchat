package V1;

import H0.n1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A implements LayoutInflater.Factory2 {

    /* renamed from: Y  reason: collision with root package name */
    public final K f18015Y;

    public A(K k10) {
        this.f18015Y = k10;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        P p10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        K k10 = this.f18015Y;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k10);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U1.a.f17386a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null) {
            return null;
        }
        try {
            if (AbstractComponentCallbacksC1480v.class.isAssignableFrom(E.b(context.getClassLoader(), attributeValue))) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC1480v B10 = resourceId != -1 ? k10.B(resourceId) : null;
                if (B10 == null && string != null) {
                    U3.i iVar = k10.f18046c;
                    int size = ((ArrayList) iVar.f17414Y).size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = (AbstractComponentCallbacksC1480v) ((ArrayList) iVar.f17414Y).get(size);
                            if (abstractComponentCallbacksC1480v != null && string.equals(abstractComponentCallbacksC1480v.f18262C0)) {
                                B10 = abstractComponentCallbacksC1480v;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) iVar.f17415Z).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    B10 = null;
                                    break;
                                }
                                P p11 = (P) it.next();
                                if (p11 != null) {
                                    B10 = p11.f18101c;
                                    if (string.equals(B10.f18262C0)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (B10 == null && id2 != -1) {
                    B10 = k10.B(id2);
                }
                if (B10 == null) {
                    E E10 = k10.E();
                    context.getClassLoader();
                    B10 = E10.a(attributeValue);
                    B10.f18297r0 = true;
                    B10.f18260A0 = resourceId != 0 ? resourceId : id2;
                    B10.f18261B0 = id2;
                    B10.f18262C0 = string;
                    B10.f18298s0 = true;
                    B10.f18302w0 = k10;
                    C1482x c1482x = k10.f18064u;
                    B10.f18303x0 = c1482x;
                    Context context2 = c1482x.f18309Z;
                    B10.f18267H0 = true;
                    if ((c1482x == null ? null : c1482x.f18308Y) != null) {
                        B10.f18267H0 = true;
                    }
                    p10 = k10.a(B10);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + B10 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!B10.f18298s0) {
                    B10.f18298s0 = true;
                    B10.f18302w0 = k10;
                    C1482x c1482x2 = k10.f18064u;
                    B10.f18303x0 = c1482x2;
                    Context context3 = c1482x2.f18309Z;
                    B10.f18267H0 = true;
                    if ((c1482x2 == null ? null : c1482x2.f18308Y) != null) {
                        B10.f18267H0 = true;
                    }
                    p10 = k10.f(B10);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + B10 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                W1.b bVar = W1.c.f20682a;
                W1.d dVar = new W1.d(B10, viewGroup, 0);
                W1.c.c(dVar);
                W1.b a5 = W1.c.a(B10);
                if (a5.f20680a.contains(W1.a.f20675i0) && W1.c.e(a5, B10.getClass(), W1.d.class)) {
                    W1.c.b(a5, dVar);
                }
                B10.f18268I0 = viewGroup;
                p10.k();
                p10.j();
                View view2 = B10.f18269J0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B10.f18269J0.getTag() == null) {
                        B10.f18269J0.setTag(string);
                    }
                    B10.f18269J0.addOnAttachStateChangeListener(new n1(this, 1, p10));
                    return B10.f18269J0;
                }
                throw new IllegalStateException(android.gov.nist.core.a.A("Fragment ", attributeValue, " did not create a view."));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
