package M3;

import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class m extends AbstractC6540b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f11574c = new AbstractC6540b(7, 8);

    @Override // y3.AbstractC6540b
    public final void a(C3.b bVar) {
        bVar.t("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
