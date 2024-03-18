package I0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import id.AbstractC3557B;
import q0.C5252d;
import wf.AbstractC6216a;
import z.AbstractC6708l;
import z.C6672L;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f7943a;

    /* renamed from: b  reason: collision with root package name */
    public C5252d f7944b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC6216a f7945c = null;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC6216a f7946d = null;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC6216a f7947e = null;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC6216a f7948f = null;

    public b(C6672L c6672l) {
        C5252d c5252d = C5252d.f43624e;
        this.f7943a = c6672l;
        this.f7944b = c5252d;
    }

    public static void a(Menu menu, int i10) {
        int i11;
        int f6 = AbstractC6708l.f(i10);
        int f10 = AbstractC6708l.f(i10);
        if (f10 != 0) {
            if (f10 != 1) {
                if (f10 != 2) {
                    if (f10 == 3) {
                        i11 = 17039373;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i11 = 17039363;
                }
            } else {
                i11 = 17039371;
            }
        } else {
            i11 = 17039361;
        }
        menu.add(0, f6, AbstractC6708l.f(i10), i11).setShowAsAction(1);
    }

    public static void b(Menu menu, int i10, AbstractC6216a abstractC6216a) {
        if (abstractC6216a != null && menu.findItem(AbstractC6708l.f(i10)) == null) {
            a(menu, i10);
        } else if (abstractC6216a == null && menu.findItem(AbstractC6708l.f(i10)) != null) {
            menu.removeItem(AbstractC6708l.f(i10));
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        AbstractC3557B.Z(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AbstractC6216a abstractC6216a = this.f7945c;
            if (abstractC6216a != null) {
                abstractC6216a.mo122invoke();
            }
        } else if (itemId == 1) {
            AbstractC6216a abstractC6216a2 = this.f7946d;
            if (abstractC6216a2 != null) {
                abstractC6216a2.mo122invoke();
            }
        } else if (itemId == 2) {
            AbstractC6216a abstractC6216a3 = this.f7947e;
            if (abstractC6216a3 != null) {
                abstractC6216a3.mo122invoke();
            }
        } else if (itemId == 3) {
            AbstractC6216a abstractC6216a4 = this.f7948f;
            if (abstractC6216a4 != null) {
                abstractC6216a4.mo122invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.f7945c != null) {
                    a(menu, 1);
                }
                if (this.f7946d != null) {
                    a(menu, 2);
                }
                if (this.f7947e != null) {
                    a(menu, 3);
                }
                if (this.f7948f != null) {
                    a(menu, 4);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            b(menu, 1, this.f7945c);
            b(menu, 2, this.f7946d);
            b(menu, 3, this.f7947e);
            b(menu, 4, this.f7948f);
            return true;
        }
        return false;
    }
}
