package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import w.C6049A;
import w1.AbstractMenuC6081a;
import w1.AbstractMenuItemC6082b;

/* loaded from: classes.dex */
public class F extends AbstractC5028d implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final AbstractMenuC6081a f41509d;

    public F(Context context, AbstractMenuC6081a abstractMenuC6081a) {
        super(context);
        if (abstractMenuC6081a != null) {
            this.f41509d = abstractMenuC6081a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(((o) this.f41509d).add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((o) this.f41509d).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = f(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f41509d).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C6049A c6049a = (C6049A) this.f41550b;
        if (c6049a != null) {
            c6049a.clear();
        }
        C6049A c6049a2 = (C6049A) this.f41551c;
        if (c6049a2 != null) {
            c6049a2.clear();
        }
        ((o) this.f41509d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f41509d).close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return f(((o) this.f41509d).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return f(((o) this.f41509d).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f41509d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f41509d).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f41509d).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f41509d).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((C6049A) this.f41550b) != null) {
            int i11 = 0;
            while (true) {
                C6049A c6049a = (C6049A) this.f41550b;
                if (i11 >= c6049a.f47560h0) {
                    break;
                }
                if (((AbstractMenuItemC6082b) c6049a.g(i11)).getGroupId() == i10) {
                    ((C6049A) this.f41550b).h(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f41509d).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((C6049A) this.f41550b) != null) {
            int i11 = 0;
            while (true) {
                C6049A c6049a = (C6049A) this.f41550b;
                if (i11 >= c6049a.f47560h0) {
                    break;
                } else if (((AbstractMenuItemC6082b) c6049a.g(i11)).getItemId() == i10) {
                    ((C6049A) this.f41550b).h(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        ((o) this.f41509d).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ((o) this.f41509d).setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ((o) this.f41509d).setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ((o) this.f41509d).setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f41509d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f41509d).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return f(((o) this.f41509d).add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f41509d).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return f(((o) this.f41509d).add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return ((o) this.f41509d).addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return f(((o) this.f41509d).add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f41509d).addSubMenu(i10, i11, i12, i13);
    }
}
