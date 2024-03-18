package c8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: c8.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305b extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f26348h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextPaint f26349i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ P4.a f26350j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C2306c f26351k;

    public C2305b(C2306c c2306c, Context context, TextPaint textPaint, P4.a aVar) {
        this.f26351k = c2306c;
        this.f26348h = context;
        this.f26349i = textPaint;
        this.f26350j = aVar;
    }

    @Override // P4.a
    public final void r0(int i10) {
        this.f26350j.r0(i10);
    }

    @Override // P4.a
    public final void s0(Typeface typeface, boolean z10) {
        this.f26351k.g(this.f26348h, this.f26349i, typeface);
        this.f26350j.s0(typeface, z10);
    }
}
