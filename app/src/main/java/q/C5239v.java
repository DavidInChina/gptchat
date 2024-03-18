package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import l.AbstractC4308a;
import t1.AbstractC5656b;

/* renamed from: q.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5239v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43563a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f43564b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f43565c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43566d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43567e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f43568f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f43569g;

    public /* synthetic */ C5239v(TextView textView, int i10) {
        this.f43563a = i10;
        this.f43569g = textView;
    }

    public final void a() {
        TextView textView = this.f43569g;
        Drawable a5 = H1.c.a((CompoundButton) textView);
        if (a5 != null) {
            if (this.f43566d || this.f43567e) {
                Drawable mutate = a5.mutate();
                if (this.f43566d) {
                    AbstractC5656b.h(mutate, this.f43564b);
                }
                if (this.f43567e) {
                    AbstractC5656b.i(mutate, this.f43565c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f43569g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f43566d || this.f43567e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f43566d) {
                    AbstractC5656b.h(mutate, this.f43564b);
                }
                if (this.f43567e) {
                    AbstractC5656b.i(mutate, this.f43565c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:9:0x003c, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:16:0x006d, B:18:0x0073, B:19:0x007d, B:21:0x0083), top: B:56:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:5:0x0030, B:7:0x0036, B:9:0x003c, B:11:0x0050, B:13:0x0056, B:15:0x005c, B:16:0x006d, B:18:0x0073, B:19:0x007d, B:21:0x0083), top: B:56:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:27:0x00b5, B:29:0x00bb, B:31:0x00c1, B:33:0x00d5, B:35:0x00db, B:37:0x00e1, B:38:0x00f2, B:40:0x00f8, B:41:0x0102, B:43:0x0108), top: B:52:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #1 {all -> 0x00d3, blocks: (B:27:0x00b5, B:29:0x00bb, B:31:0x00c1, B:33:0x00d5, B:35:0x00db, B:37:0x00e1, B:38:0x00f2, B:40:0x00f8, B:41:0x0102, B:43:0x0108), top: B:52:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AttributeSet attributeSet, int i10) {
        U3.u I10;
        int z10;
        int z11;
        int z12;
        int z13;
        int i11 = this.f43563a;
        TextView textView = this.f43569g;
        switch (i11) {
            case 0:
                CheckedTextView checkedTextView = (CheckedTextView) textView;
                Context context = checkedTextView.getContext();
                int[] iArr = AbstractC4308a.f37675l;
                I10 = U3.u.I(context, attributeSet, iArr, i10, 0);
                D1.Z.k(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) I10.f17493h0, i10);
                try {
                    if (I10.E(1) && (z11 = I10.z(1, 0)) != 0) {
                        try {
                            ((CheckedTextView) textView).setCheckMarkDrawable(kotlin.jvm.internal.m.u(((CheckedTextView) textView).getContext(), z11));
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (I10.E(2)) {
                            ((CheckedTextView) textView).setCheckMarkTintList(I10.p(2));
                        }
                        if (I10.E(3)) {
                            ((CheckedTextView) textView).setCheckMarkTintMode(AbstractC5238u0.b(I10.x(3, -1), null));
                        }
                        return;
                    }
                    if (I10.E(0) && (z10 = I10.z(0, 0)) != 0) {
                        ((CheckedTextView) textView).setCheckMarkDrawable(kotlin.jvm.internal.m.u(((CheckedTextView) textView).getContext(), z10));
                    }
                    if (I10.E(2)) {
                    }
                    if (I10.E(3)) {
                    }
                    return;
                } finally {
                }
            default:
                CompoundButton compoundButton = (CompoundButton) textView;
                Context context2 = compoundButton.getContext();
                int[] iArr2 = AbstractC4308a.f37676m;
                I10 = U3.u.I(context2, attributeSet, iArr2, i10, 0);
                D1.Z.k(compoundButton, compoundButton.getContext(), iArr2, attributeSet, (TypedArray) I10.f17493h0, i10);
                try {
                    if (I10.E(1) && (z13 = I10.z(1, 0)) != 0) {
                        try {
                            ((CompoundButton) textView).setButtonDrawable(kotlin.jvm.internal.m.u(((CompoundButton) textView).getContext(), z13));
                        } catch (Resources.NotFoundException unused2) {
                        }
                        if (I10.E(2)) {
                            H1.b.c((CompoundButton) textView, I10.p(2));
                        }
                        if (I10.E(3)) {
                            H1.b.d((CompoundButton) textView, AbstractC5238u0.b(I10.x(3, -1), null));
                        }
                        return;
                    }
                    if (I10.E(0) && (z12 = I10.z(0, 0)) != 0) {
                        ((CompoundButton) textView).setButtonDrawable(kotlin.jvm.internal.m.u(((CompoundButton) textView).getContext(), z12));
                    }
                    if (I10.E(2)) {
                    }
                    if (I10.E(3)) {
                    }
                    return;
                } finally {
                }
        }
    }
}
