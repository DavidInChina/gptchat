package U3;

import p.AbstractC5028d;
import x3.y;

/* loaded from: classes.dex */
public final class m extends AbstractC5028d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(y yVar, int i10) {
        super(yVar);
        this.f17425d = i10;
    }

    @Override // p.AbstractC5028d
    public final String e() {
        switch (this.f17425d) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            default:
                return "DELETE FROM WorkProgress";
        }
    }
}
