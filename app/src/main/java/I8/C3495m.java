package i8;

import android.text.Editable;

/* renamed from: i8.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3495m extends a8.j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C3497o f32789Y;

    public C3495m(C3497o c3497o) {
        this.f32789Y = c3497o;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f32789Y.b().a();
    }

    @Override // a8.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f32789Y.b().b();
    }
}
