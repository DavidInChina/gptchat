package b8;

import H1.b;
import android.content.res.ColorStateList;
import com.openai.chatgpt.R;
import q.H;

/* renamed from: b8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2131a extends H {

    /* renamed from: n0  reason: collision with root package name */
    public static final int[][] f25652n0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f25653l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f25654m0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25653l0 == null) {
            int R10 = P4.a.R(this, R.attr.colorControlActivated);
            int R11 = P4.a.R(this, R.attr.colorOnSurface);
            int R12 = P4.a.R(this, R.attr.colorSurface);
            this.f25653l0 = new ColorStateList(f25652n0, new int[]{P4.a.k0(1.0f, R12, R10), P4.a.k0(0.54f, R12, R11), P4.a.k0(0.38f, R12, R11), P4.a.k0(0.38f, R12, R11)});
        }
        return this.f25653l0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25654m0 && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f25654m0 = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
