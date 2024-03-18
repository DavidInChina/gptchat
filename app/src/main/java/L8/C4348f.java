package l8;

import android.content.Context;

/* renamed from: l8.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4348f implements m8.c {

    /* renamed from: Y  reason: collision with root package name */
    public final androidx.appcompat.view.a f37872Y;

    public C4348f(androidx.appcompat.view.a aVar) {
        this.f37872Y = aVar;
    }

    @Override // m8.c
    public final Object g() {
        Context context = this.f37872Y.f24351a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
