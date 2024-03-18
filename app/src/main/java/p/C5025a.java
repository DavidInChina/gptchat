package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p1.AbstractC5038c;
import p1.AbstractC5042g;
import t1.AbstractC5656b;
import w1.AbstractMenuItemC6082b;

/* renamed from: p.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5025a implements AbstractMenuItemC6082b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f41532a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f41533b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f41534c;

    /* renamed from: d  reason: collision with root package name */
    public char f41535d;

    /* renamed from: f  reason: collision with root package name */
    public char f41537f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f41539h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f41540i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f41541j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f41542k;

    /* renamed from: e  reason: collision with root package name */
    public int f41536e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f41538g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f41543l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f41544m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f41545n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f41546o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f41547p = 16;

    public C5025a(Context context, CharSequence charSequence) {
        this.f41540i = context;
        this.f41532a = charSequence;
    }

    @Override // w1.AbstractMenuItemC6082b
    public final AbstractMenuItemC6082b a(r rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // w1.AbstractMenuItemC6082b
    public final r b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f41539h;
        if (drawable != null) {
            if (this.f41545n || this.f41546o) {
                this.f41539h = drawable;
                Drawable mutate = drawable.mutate();
                this.f41539h = mutate;
                if (this.f41545n) {
                    AbstractC5656b.h(mutate, this.f41543l);
                }
                if (this.f41546o) {
                    AbstractC5656b.i(this.f41539h, this.f41544m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f41538g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f41537f;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f41541j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f41539h;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f41543l;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f41544m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f41534c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f41536e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f41535d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f41532a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f41533b;
        if (charSequence == null) {
            return this.f41532a;
        }
        return charSequence;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f41542k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f41547p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f41547p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f41547p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f41547p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f41537f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f41547p = (z10 ? 1 : 0) | (this.f41547p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f41547p & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f41547p = i10 | i11;
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setContentDescription */
    public final MenuItem mo110setContentDescription(CharSequence charSequence) {
        this.f41541j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f41547p & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f41547p = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f41539h = drawable;
        c();
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f41543l = colorStateList;
        this.f41545n = true;
        c();
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f41544m = mode;
        this.f41546o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f41534c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f41535d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f41535d = c10;
        this.f41537f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f41532a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f41533b = charSequence;
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setTooltipText */
    public final MenuItem mo111setTooltipText(CharSequence charSequence) {
        this.f41542k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f41547p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f41547p = i11 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f41537f = Character.toLowerCase(c10);
        this.f41538g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final AbstractMenuItemC6082b mo110setContentDescription(CharSequence charSequence) {
        this.f41541j = charSequence;
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f41535d = c10;
        this.f41536e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f41532a = this.f41540i.getResources().getString(i10);
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final AbstractMenuItemC6082b mo111setTooltipText(CharSequence charSequence) {
        this.f41542k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Context context = this.f41540i;
        Object obj = AbstractC5042g.f41723a;
        this.f41539h = AbstractC5038c.b(context, i10);
        c();
        return this;
    }

    @Override // w1.AbstractMenuItemC6082b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f41535d = c10;
        this.f41536e = KeyEvent.normalizeMetaState(i10);
        this.f41537f = Character.toLowerCase(c11);
        this.f41538g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
