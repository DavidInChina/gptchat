package M3;

import y3.AbstractC6540b;

/* renamed from: M3.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0937f extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0937f f11567c = new AbstractC6540b(12, 13);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        bVar.t("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
