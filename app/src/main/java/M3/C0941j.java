package M3;

import y3.AbstractC6540b;

/* renamed from: M3.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0941j extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0941j f11571c = new AbstractC6540b(3, 4);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
