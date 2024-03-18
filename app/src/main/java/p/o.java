package p;

import D1.AbstractC0342b0;
import D1.AbstractC0344c0;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p1.AbstractC5038c;
import p1.AbstractC5042g;
import w1.AbstractMenuC6081a;

/* loaded from: classes.dex */
public class o implements AbstractMenuC6081a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f41604y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f41605a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f41606b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41607c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f41608d;

    /* renamed from: e  reason: collision with root package name */
    public m f41609e;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f41617m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f41618n;

    /* renamed from: o  reason: collision with root package name */
    public View f41619o;

    /* renamed from: v  reason: collision with root package name */
    public q f41626v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f41628x;

    /* renamed from: l  reason: collision with root package name */
    public int f41616l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f41620p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f41621q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f41622r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f41623s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f41624t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f41625u = new CopyOnWriteArrayList();

    /* renamed from: w  reason: collision with root package name */
    public boolean f41627w = false;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f41610f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f41611g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f41612h = true;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f41613i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f41614j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f41615k = true;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z10 = false;
        this.f41605a = context;
        Resources resources2 = context.getResources();
        this.f41606b = resources2;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0344c0.f3257a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : AbstractC0342b0.b(viewConfiguration)) {
                z10 = true;
            }
        }
        this.f41608d = z10;
    }

    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f41604y[i14] << 16) | (65535 & i12);
            q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f41616l);
            ArrayList arrayList = this.f41610f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((q) arrayList.get(size)).f41638d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, qVar);
            p(true);
            return qVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f41605a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a5 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a5.setIcon(resolveInfo.loadIcon(packageManager));
            a5.f41641g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a5;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(C c10, Context context) {
        this.f41625u.add(new WeakReference(c10));
        c10.c(context, this);
        this.f41615k = true;
    }

    public final void c(boolean z10) {
        if (this.f41623s) {
            return;
        }
        this.f41623s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C c10 = (C) weakReference.get();
            if (c10 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c10.b(this, z10);
            }
        }
        this.f41623s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f41626v;
        if (qVar != null) {
            d(qVar);
        }
        this.f41610f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f41618n = null;
        this.f41617m = null;
        this.f41619o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f41626v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C c10 = (C) weakReference.get();
                if (c10 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = c10.k(qVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f41626v = null;
            }
        }
        return z10;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f41609e;
        if (mVar != null && mVar.i(oVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C c10 = (C) weakReference.get();
            if (c10 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = c10.j(qVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f41626v = qVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f41635a == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f41649o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f41624t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (n10) {
                c10 = qVar.f41644j;
            } else {
                c10 = qVar.f41642h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f41610f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f41610f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList2.get(i12);
            if (qVar.hasSubMenu()) {
                qVar.f41649o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c10 = qVar.f41644j;
            } else {
                c10 = qVar.f41642h;
            }
            if (n10) {
                i11 = qVar.f41645k;
            } else {
                i11 = qVar.f41643i;
            }
            if ((modifiers & 69647) == (i11 & 69647) && c10 != 0) {
                char[] cArr = keyData.meta;
                if (c10 != cArr[0] && c10 != cArr[2]) {
                    if (n10 && c10 == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (qVar.isEnabled()) {
                    arrayList.add(qVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f41628x) {
            return true;
        }
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f41615k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C c10 = (C) weakReference.get();
            if (c10 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= c10.d();
            }
        }
        ArrayList arrayList = this.f41613i;
        ArrayList arrayList2 = this.f41614j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) l10.get(i10);
                if (qVar.f()) {
                    arrayList.add(qVar);
                } else {
                    arrayList2.add(qVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f41615k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f41612h;
        ArrayList arrayList = this.f41611g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f41610f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f41612h = false;
        this.f41615k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f41627w;
    }

    public boolean n() {
        return this.f41607c;
    }

    public boolean o() {
        return this.f41608d;
    }

    public final void p(boolean z10) {
        if (!this.f41620p) {
            if (z10) {
                this.f41612h = true;
                this.f41615k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C c10 = (C) weakReference.get();
                    if (c10 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        c10.g();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f41621q = true;
        if (z10) {
            this.f41622r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        q g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, C c10, int i10) {
        boolean z10;
        r rVar;
        boolean z11;
        q qVar = (q) menuItem;
        boolean z12 = false;
        if (qVar == null || !qVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = qVar.f41650p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(qVar)) {
            o oVar = qVar.f41648n;
            if (!oVar.e(oVar, qVar)) {
                Intent intent = qVar.f41641g;
                if (intent != null) {
                    try {
                        oVar.f41605a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        AbstractC3612c.d("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    }
                }
                r rVar2 = qVar.f41632A;
                if (rVar2 == null || !rVar2.f41661a.onPerformDefaultAction()) {
                    z10 = false;
                    rVar = qVar.f41632A;
                    if (rVar == null && rVar.f41661a.hasSubMenu()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!qVar.e()) {
                        z10 |= qVar.expandActionView();
                        if (z10) {
                            c(true);
                        }
                    } else if (!qVar.hasSubMenu() && !z11) {
                        if ((i10 & 1) == 0) {
                            c(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!qVar.hasSubMenu()) {
                            I i11 = new I(this.f41605a, this, qVar);
                            qVar.f41649o = i11;
                            i11.setHeaderTitle(qVar.f41639e);
                        }
                        I i12 = qVar.f41649o;
                        if (z11) {
                            rVar.f41662b.getClass();
                            rVar.f41661a.onPrepareSubMenu(i12);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (c10 != null) {
                                z12 = c10.i(i12);
                            }
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                C c11 = (C) weakReference.get();
                                if (c11 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!z12) {
                                    z12 = c11.i(i12);
                                }
                            }
                        }
                        z10 |= z12;
                        if (!z10) {
                            c(true);
                        }
                    }
                    return z10;
                }
            }
        }
        z10 = true;
        rVar = qVar.f41632A;
        if (rVar == null) {
        }
        z11 = false;
        if (!qVar.e()) {
        }
        return z10;
    }

    public final void r(C c10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41625u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C c11 = (C) weakReference.get();
            if (c11 == null || c11 == c10) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (((q) arrayList.get(i12)).f41636b == i10) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((q) arrayList.get(i12)).f41636b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f41610f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((q) arrayList.get(i11)).f41635a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f41610f;
            if (i11 < arrayList2.size()) {
                arrayList2.remove(i11);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f41610f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((I) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f41636b == i10) {
                int i13 = qVar.f41658x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                qVar.f41658x = i13 | i11;
                qVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f41627w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f41636b == i10) {
                qVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        ArrayList arrayList = this.f41610f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f41636b == i10) {
                int i13 = qVar.f41658x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                qVar.f41658x = i15;
                if (i13 != i15) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f41607c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f41610f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f41610f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((I) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f41606b;
        if (view != null) {
            this.f41619o = view;
            this.f41617m = null;
            this.f41618n = null;
        } else {
            if (i10 > 0) {
                this.f41617m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f41617m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f41605a;
                Object obj = AbstractC5042g.f41723a;
                this.f41618n = AbstractC5038c.b(context, i11);
            } else if (drawable != null) {
                this.f41618n = drawable;
            }
            this.f41619o = null;
        }
        p(false);
    }

    public final void v() {
        this.f41620p = false;
        if (this.f41621q) {
            this.f41621q = false;
            p(this.f41622r);
        }
    }

    public final void w() {
        if (!this.f41620p) {
            this.f41620p = true;
            this.f41621q = false;
            this.f41622r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f41606b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f41606b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q a5 = a(i10, i11, i12, charSequence);
        I i13 = new I(this.f41605a, this, a5);
        a5.f41649o = i13;
        i13.setHeaderTitle(a5.f41639e);
        return i13;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f41606b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f41606b.getString(i13));
    }

    public o k() {
        return this;
    }
}
