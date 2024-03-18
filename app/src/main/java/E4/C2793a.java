package e4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import id.AbstractC3557B;

/* renamed from: e4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2793a {

    /* renamed from: a  reason: collision with root package name */
    public final Cursor f28944a;

    public C2793a(Cursor cursor, Long l10) {
        AbstractC3557B.c0("cursor", cursor);
        this.f28944a = cursor;
        if (Build.VERSION.SDK_INT >= 28 && l10 != null && (cursor instanceof AbstractWindowedCursor)) {
            AbstractC2803k.a((AbstractWindowedCursor) cursor, l10.longValue());
        }
    }

    public final String a(int i10) {
        Cursor cursor = this.f28944a;
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}
