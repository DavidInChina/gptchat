package O8;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class d extends L8.e {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Class cls, int i10) {
        super(cls);
        this.f13434c = i10;
    }

    @Override // L8.e
    public final Date a(Date date) {
        switch (this.f13434c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
