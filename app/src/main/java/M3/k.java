package M3;

import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class k extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final k f11572c = new AbstractC6540b(4, 5);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        bVar.t("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
