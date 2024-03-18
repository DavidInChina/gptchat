package androidx.appcompat.view;

import D1.AbstractC0369p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p.q;
import p.r;
import p.w;
import w1.AbstractMenuItemC6082b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f24371A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f24372B;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ k f24375E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f24376a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24383h;

    /* renamed from: i  reason: collision with root package name */
    public int f24384i;

    /* renamed from: j  reason: collision with root package name */
    public int f24385j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f24386k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f24387l;

    /* renamed from: m  reason: collision with root package name */
    public int f24388m;

    /* renamed from: n  reason: collision with root package name */
    public char f24389n;

    /* renamed from: o  reason: collision with root package name */
    public int f24390o;

    /* renamed from: p  reason: collision with root package name */
    public char f24391p;

    /* renamed from: q  reason: collision with root package name */
    public int f24392q;

    /* renamed from: r  reason: collision with root package name */
    public int f24393r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f24394s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f24395t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f24396u;

    /* renamed from: v  reason: collision with root package name */
    public int f24397v;

    /* renamed from: w  reason: collision with root package name */
    public int f24398w;

    /* renamed from: x  reason: collision with root package name */
    public String f24399x;

    /* renamed from: y  reason: collision with root package name */
    public String f24400y;

    /* renamed from: z  reason: collision with root package name */
    public r f24401z;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f24373C = null;

    /* renamed from: D  reason: collision with root package name */
    public PorterDuff.Mode f24374D = null;

    /* renamed from: b  reason: collision with root package name */
    public int f24377b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f24378c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f24379d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f24380e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24381f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24382g = true;

    public j(k kVar, Menu menu) {
        this.f24375E = kVar;
        this.f24376a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f24375E.f24406c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            AbstractC3612c.s("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, androidx.appcompat.view.i, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z10;
        MenuItem enabled = menuItem.setChecked(this.f24394s).setVisible(this.f24395t).setEnabled(this.f24396u);
        boolean z11 = false;
        if (this.f24393r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f24387l).setIcon(this.f24388m);
        int i10 = this.f24397v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f24400y;
        k kVar = this.f24375E;
        if (str != null) {
            if (!kVar.f24406c.isRestricted()) {
                if (kVar.f24407d == null) {
                    kVar.f24407d = k.a(kVar.f24406c);
                }
                Object obj = kVar.f24407d;
                String str2 = this.f24400y;
                ?? obj2 = new Object();
                obj2.f24369a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f24370b = cls.getMethod(str2, i.f24368c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder s10 = android.gov.nist.core.a.s("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    s10.append(cls.getName());
                    InflateException inflateException = new InflateException(s10.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f24393r >= 2) {
            if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                qVar.f41658x = (qVar.f41658x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f41670e;
                    AbstractMenuItemC6082b abstractMenuItemC6082b = wVar.f41669d;
                    if (method == null) {
                        wVar.f41670e = abstractMenuItemC6082b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f41670e.invoke(abstractMenuItemC6082b, Boolean.TRUE);
                } catch (Exception e11) {
                    AbstractC3612c.s("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str3 = this.f24399x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, k.f24402e, kVar.f24404a));
            z11 = true;
        }
        int i11 = this.f24398w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                AbstractC3612c.r("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        r rVar = this.f24401z;
        if (rVar != null) {
            if (menuItem instanceof AbstractMenuItemC6082b) {
                ((AbstractMenuItemC6082b) menuItem).a(rVar);
            } else {
                AbstractC3612c.r("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f24371A;
        boolean z12 = menuItem instanceof AbstractMenuItemC6082b;
        if (z12) {
            ((AbstractMenuItemC6082b) menuItem).mo110setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0369p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f24372B;
        if (z12) {
            ((AbstractMenuItemC6082b) menuItem).mo111setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0369p.m(menuItem, charSequence2);
        }
        char c10 = this.f24389n;
        int i12 = this.f24390o;
        if (z12) {
            ((AbstractMenuItemC6082b) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0369p.g(menuItem, c10, i12);
        }
        char c11 = this.f24391p;
        int i13 = this.f24392q;
        if (z12) {
            ((AbstractMenuItemC6082b) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0369p.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.f24374D;
        if (mode != null) {
            if (z12) {
                ((AbstractMenuItemC6082b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0369p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f24373C;
        if (colorStateList != null) {
            if (z12) {
                ((AbstractMenuItemC6082b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0369p.i(menuItem, colorStateList);
            }
        }
    }
}
