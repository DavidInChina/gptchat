package H0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class u1 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(I1.a aVar) {
        super(new Handler());
        this.f7051a = 1;
        this.f7052b = aVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f7051a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f7051a) {
            case 1:
                I1.a aVar = (I1.a) this.f7052b;
                if (!aVar.f7950Z || (cursor = aVar.f7951h0) == null || cursor.isClosed()) {
                    return;
                }
                aVar.f7949Y = aVar.f7951h0.requery();
                return;
            default:
                super.onChange(z10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Pg.k kVar, Handler handler, int i10) {
        super(handler);
        this.f7051a = i10;
        this.f7052b = kVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        int i10 = this.f7051a;
        Object obj = this.f7052b;
        switch (i10) {
            case 0:
                ((Pg.o) obj).t(jf.y.f36177a);
                return;
            case 1:
            default:
                super.onChange(z10, uri);
                return;
            case 2:
                ((Q1.x) obj).c();
                return;
        }
    }
}
