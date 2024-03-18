package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import t1.AbstractC5656b;
import w1.AbstractMenuItemC6082b;

/* loaded from: classes.dex */
public final class q implements AbstractMenuItemC6082b {

    /* renamed from: A  reason: collision with root package name */
    public r f41632A;

    /* renamed from: B  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f41633B;

    /* renamed from: a  reason: collision with root package name */
    public final int f41635a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41636b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41637c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41638d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f41639e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f41640f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f41641g;

    /* renamed from: h  reason: collision with root package name */
    public char f41642h;

    /* renamed from: j  reason: collision with root package name */
    public char f41644j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f41646l;

    /* renamed from: n  reason: collision with root package name */
    public final o f41648n;

    /* renamed from: o  reason: collision with root package name */
    public I f41649o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f41650p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f41651q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f41652r;

    /* renamed from: y  reason: collision with root package name */
    public int f41659y;

    /* renamed from: z  reason: collision with root package name */
    public View f41660z;

    /* renamed from: i  reason: collision with root package name */
    public int f41643i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f41645k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f41647m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f41653s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f41654t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f41655u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f41656v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f41657w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f41658x = 16;

    /* renamed from: C  reason: collision with root package name */
    public boolean f41634C = false;

    public q(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f41648n = oVar;
        this.f41635a = i11;
        this.f41636b = i10;
        this.f41637c = i12;
        this.f41638d = i13;
        this.f41639e = charSequence;
        this.f41659y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // w1.AbstractMenuItemC6082b
    public final AbstractMenuItemC6082b a(r rVar) {
        r rVar2 = this.f41632A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f41660z = null;
        this.f41632A = rVar;
        this.f41648n.p(true);
        r rVar3 = this.f41632A;
        if (rVar3 != null) {
            rVar3.d(new F4.a(3, this));
        }
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b
    public final r b() {
        return this.f41632A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f41659y & 8) == 0) {
            return false;
        }
        if (this.f41660z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f41633B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f41648n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f41657w && (this.f41655u || this.f41656v)) {
            drawable = drawable.mutate();
            if (this.f41655u) {
                AbstractC5656b.h(drawable, this.f41653s);
            }
            if (this.f41656v) {
                AbstractC5656b.i(drawable, this.f41654t);
            }
            this.f41657w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f41659y & 8) == 0) {
            return false;
        }
        if (this.f41660z == null && (rVar = this.f41632A) != null) {
            this.f41660z = rVar.b(this);
        }
        if (this.f41660z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f41633B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f41648n.f(this);
    }

    public final boolean f() {
        if ((this.f41658x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f41658x |= 32;
        } else {
            this.f41658x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f41660z;
        if (view != null) {
            return view;
        }
        r rVar = this.f41632A;
        if (rVar != null) {
            View b10 = rVar.b(this);
            this.f41660z = b10;
            return b10;
        }
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f41645k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f41644j;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f41651q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f41636b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f41646l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f41647m;
        if (i10 != 0) {
            Drawable u10 = kotlin.jvm.internal.m.u(this.f41648n.f41605a, i10);
            this.f41647m = 0;
            this.f41646l = u10;
            return d(u10);
        }
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f41653s;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f41654t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f41641g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f41635a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f41643i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f41642h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f41637c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f41649o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f41639e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f41640f;
        if (charSequence == null) {
            return this.f41639e;
        }
        return charSequence;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f41652r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f41649o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f41634C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f41658x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f41658x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f41658x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.f41632A;
        if (rVar != null && rVar.c()) {
            if ((this.f41658x & 8) != 0 || !this.f41632A.a()) {
                return false;
            }
            return true;
        } else if ((this.f41658x & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f41660z = view;
        this.f41632A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f41635a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f41648n;
        oVar.f41615k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f41644j == c10) {
            return this;
        }
        this.f41644j = Character.toLowerCase(c10);
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f41658x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f41658x = i11;
        if (i10 != i11) {
            this.f41648n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f41658x;
        int i12 = 2;
        if ((i11 & 4) != 0) {
            o oVar = this.f41648n;
            oVar.getClass();
            ArrayList arrayList = oVar.f41610f;
            int size = arrayList.size();
            oVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                q qVar = (q) arrayList.get(i13);
                if (qVar.f41636b == this.f41636b && (qVar.f41658x & 4) != 0 && qVar.isCheckable()) {
                    if (qVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = qVar.f41658x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i16 = i10 | i15;
                    qVar.f41658x = i16;
                    if (i14 != i16) {
                        qVar.f41648n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i17 = i11 & (-3);
            if (!z10) {
                i12 = 0;
            }
            int i18 = i17 | i12;
            this.f41658x = i18;
            if (i11 != i18) {
                this.f41648n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f41658x |= 16;
        } else {
            this.f41658x &= -17;
        }
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f41646l = null;
        this.f41647m = i10;
        this.f41657w = true;
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f41653s = colorStateList;
        this.f41655u = true;
        this.f41657w = true;
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f41654t = mode;
        this.f41656v = true;
        this.f41657w = true;
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f41641g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f41642h == c10) {
            return this;
        }
        this.f41642h = c10;
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f41633B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f41650p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f41642h = c10;
        this.f41644j = Character.toLowerCase(c11);
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f41659y = i10;
        o oVar = this.f41648n;
        oVar.f41615k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f41639e = charSequence;
        this.f41648n.p(false);
        I i10 = this.f41649o;
        if (i10 != null) {
            i10.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f41640f = charSequence;
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f41658x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f41658x = i13;
        if (i11 != i13) {
            o oVar = this.f41648n;
            oVar.f41612h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f41639e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public final AbstractMenuItemC6082b mo110setContentDescription(CharSequence charSequence) {
        this.f41651q = charSequence;
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public final AbstractMenuItemC6082b mo111setTooltipText(CharSequence charSequence) {
        this.f41652r = charSequence;
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f41644j == c10 && this.f41645k == i10) {
            return this;
        }
        this.f41644j = Character.toLowerCase(c10);
        this.f41645k = KeyEvent.normalizeMetaState(i10);
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f41642h == c10 && this.f41643i == i10) {
            return this;
        }
        this.f41642h = c10;
        this.f41643i = KeyEvent.normalizeMetaState(i10);
        this.f41648n.p(false);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f41642h = c10;
        this.f41643i = KeyEvent.normalizeMetaState(i10);
        this.f41644j = Character.toLowerCase(c11);
        this.f41645k = KeyEvent.normalizeMetaState(i11);
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f41648n.f41605a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f41647m = 0;
        this.f41646l = drawable;
        this.f41657w = true;
        this.f41648n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f41648n.f41605a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f41660z = inflate;
        this.f41632A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f41635a) > 0) {
            inflate.setId(i11);
        }
        o oVar = this.f41648n;
        oVar.f41615k = true;
        oVar.p(true);
        return this;
    }
}
