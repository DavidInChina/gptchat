package Z8;

/* renamed from: Z8.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1802j extends AbstractC1831y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1802j(String str, int i10) {
        super(str);
        this.f23357b = i10;
    }

    @Override // Z8.AbstractC1831y
    public final String a() {
        switch (this.f23357b) {
            case 0:
                return "App";
            case 1:
                return "Auth";
            case 2:
                return "Compliance";
            case 3:
                return "Dalle";
            case 4:
                return "Disclosures";
            case 5:
                return "Gizmos";
            case 6:
                return "MessageAudio";
            case 7:
                return "MessagePopupMenu";
            case 8:
                return "Navigation";
            case 9:
                return "Subscription";
            case 10:
                return "Thread";
            case 11:
                return "Vision";
            case 12:
                return "WebSocket";
            case 13:
                return "Whisper";
            default:
                return "Widget";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1802j(String str, int i10, int i11) {
        this(str, 0);
        this.f23357b = i10;
        switch (i10) {
            case 1:
                this(str, 1);
                return;
            case 2:
                this(str, 2);
                return;
            case 3:
                this(str, 3);
                return;
            case 4:
                this(str, 4);
                return;
            case 5:
                this(str, 5);
                return;
            case 6:
                this(str, 6);
                return;
            case 7:
                this(str, 7);
                return;
            case 8:
                this(str, 8);
                return;
            case 9:
                this(str, 9);
                return;
            case 10:
                this(str, 10);
                return;
            case 11:
                this(str, 11);
                return;
            case 12:
                this(str, 12);
                return;
            case 13:
                this(str, 13);
                return;
            case 14:
                this(str, 14);
                return;
            default:
                return;
        }
    }
}
