package com.google.android.material.internal;

import D1.Z;
import K1.b;
import Q7.a;
import a8.C1935a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.openai.chatgpt.R;
import q.B;

/* loaded from: classes.dex */
public class CheckableImageButton extends B implements Checkable {

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f27211n0 = {16842912};

    /* renamed from: k0  reason: collision with root package name */
    public boolean f27212k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f27213l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f27214m0 = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        Z.l(this, new a(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27212k0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f27212k0) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f27211n0);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1935a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1935a c1935a = (C1935a) parcelable;
        super.onRestoreInstanceState(c1935a.f9325Y);
        setChecked(c1935a.f23930h0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, a8.a, K1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f23930h0 = this.f27212k0;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f27213l0 != z10) {
            this.f27213l0 = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f27213l0 && this.f27212k0 != z10) {
            this.f27212k0 = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f27214m0 = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f27214m0) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f27212k0);
    }
}
