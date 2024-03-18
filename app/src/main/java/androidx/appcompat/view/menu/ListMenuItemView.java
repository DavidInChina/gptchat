package androidx.appcompat.view.menu;

import D1.H;
import D1.Z;
import U3.u;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import l.AbstractC4308a;
import p.D;
import p.o;
import p.q;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements D, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: h0  reason: collision with root package name */
    public q f24431h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f24432i0;

    /* renamed from: j0  reason: collision with root package name */
    public RadioButton f24433j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f24434k0;

    /* renamed from: l0  reason: collision with root package name */
    public CheckBox f24435l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f24436m0;

    /* renamed from: n0  reason: collision with root package name */
    public ImageView f24437n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f24438o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f24439p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Drawable f24440q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f24441r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Context f24442s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24443t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Drawable f24444u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f24445v0;

    /* renamed from: w0  reason: collision with root package name */
    public LayoutInflater f24446w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f24447x0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u I10 = u.I(getContext(), attributeSet, AbstractC4308a.f37681r, R.attr.listMenuViewStyle, 0);
        this.f24440q0 = I10.t(5);
        this.f24441r0 = I10.z(1, -1);
        this.f24443t0 = I10.o(7, false);
        this.f24442s0 = context;
        this.f24444u0 = I10.t(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f24445v0 = obtainStyledAttributes.hasValue(0);
        I10.N();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f24446w0 == null) {
            this.f24446w0 = LayoutInflater.from(getContext());
        }
        return this.f24446w0;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f24437n0;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f24438o0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24438o0.getLayoutParams();
            rect.top = this.f24438o0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r0 != 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    @Override // p.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(q qVar) {
        int i10;
        boolean z10;
        char c10;
        String str;
        int i11;
        char c11;
        char c12;
        this.f24431h0 = qVar;
        int i12 = 0;
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setTitle(qVar.f41639e);
        setCheckable(qVar.isCheckable());
        if (qVar.f41648n.o()) {
            if (qVar.f41648n.n()) {
                c12 = qVar.f41644j;
            } else {
                c12 = qVar.f41642h;
            }
            if (c12 != 0) {
                z10 = true;
                qVar.f41648n.n();
                if (z10) {
                    q qVar2 = this.f24431h0;
                    if (qVar2.f41648n.o()) {
                        if (qVar2.f41648n.n()) {
                            c11 = qVar2.f41644j;
                        } else {
                            c11 = qVar2.f41642h;
                        }
                    }
                }
                i12 = 8;
                if (i12 == 0) {
                    TextView textView = this.f24436m0;
                    q qVar3 = this.f24431h0;
                    if (qVar3.f41648n.n()) {
                        c10 = qVar3.f41644j;
                    } else {
                        c10 = qVar3.f41642h;
                    }
                    if (c10 == 0) {
                        str = "";
                    } else {
                        o oVar = qVar3.f41648n;
                        Resources resources = oVar.f41605a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(oVar.f41605a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (oVar.n()) {
                            i11 = qVar3.f41645k;
                        } else {
                            i11 = qVar3.f41643i;
                        }
                        q.c(sb2, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        q.c(sb2, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        q.c(sb2, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        q.c(sb2, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        q.c(sb2, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        q.c(sb2, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                        if (c10 != '\b') {
                            if (c10 != '\n') {
                                if (c10 != ' ') {
                                    sb2.append(c10);
                                } else {
                                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        str = sb2.toString();
                    }
                    textView.setText(str);
                }
                if (this.f24436m0.getVisibility() != i12) {
                    this.f24436m0.setVisibility(i12);
                }
                setIcon(qVar.getIcon());
                setEnabled(qVar.isEnabled());
                setSubMenuArrowVisible(qVar.hasSubMenu());
                setContentDescription(qVar.f41651q);
            }
        }
        z10 = false;
        qVar.f41648n.n();
        if (z10) {
        }
        i12 = 8;
        if (i12 == 0) {
        }
        if (this.f24436m0.getVisibility() != i12) {
        }
        setIcon(qVar.getIcon());
        setEnabled(qVar.isEnabled());
        setSubMenuArrowVisible(qVar.hasSubMenu());
        setContentDescription(qVar.f41651q);
    }

    @Override // p.D
    public q getItemData() {
        return this.f24431h0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(this, this.f24440q0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f24434k0 = textView;
        int i10 = this.f24441r0;
        if (i10 != -1) {
            textView.setTextAppearance(this.f24442s0, i10);
        }
        this.f24436m0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f24437n0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f24444u0);
        }
        this.f24438o0 = (ImageView) findViewById(R.id.group_divider);
        this.f24439p0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f24432i0 != null && this.f24443t0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f24432i0.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (!z10 && this.f24433j0 == null && this.f24435l0 == null) {
            return;
        }
        if ((this.f24431h0.f41658x & 4) != 0) {
            if (this.f24433j0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f24433j0 = radioButton;
                LinearLayout linearLayout = this.f24439p0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f24433j0;
            view = this.f24435l0;
        } else {
            if (this.f24435l0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f24435l0 = checkBox;
                LinearLayout linearLayout2 = this.f24439p0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f24435l0;
            view = this.f24433j0;
        }
        if (z10) {
            compoundButton.setChecked(this.f24431h0.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f24435l0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f24433j0;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f24431h0.f41658x & 4) != 0) {
            if (this.f24433j0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f24433j0 = radioButton;
                LinearLayout linearLayout = this.f24439p0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f24433j0;
        } else {
            if (this.f24435l0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f24435l0 = checkBox;
                LinearLayout linearLayout2 = this.f24439p0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f24435l0;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f24447x0 = z10;
        this.f24443t0 = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f24438o0;
        if (imageView != null) {
            if (!this.f24445v0 && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f24431h0.f41648n.getClass();
        boolean z10 = this.f24447x0;
        if (!z10 && !this.f24443t0) {
            return;
        }
        ImageView imageView = this.f24432i0;
        if (imageView == null && drawable == null && !this.f24443t0) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f24432i0 = imageView2;
            LinearLayout linearLayout = this.f24439p0;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f24443t0) {
            this.f24432i0.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f24432i0;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f24432i0.getVisibility() != 0) {
            this.f24432i0.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f24434k0.setText(charSequence);
            if (this.f24434k0.getVisibility() != 0) {
                this.f24434k0.setVisibility(0);
            }
        } else if (this.f24434k0.getVisibility() != 8) {
            this.f24434k0.setVisibility(8);
        }
    }
}
