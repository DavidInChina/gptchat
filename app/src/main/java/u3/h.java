package U3;

import p.AbstractC5028d;
import x3.y;

/* loaded from: classes.dex */
public final class h extends AbstractC5028d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17411d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f17412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, y yVar, int i10) {
        super(yVar);
        this.f17411d = i10;
        this.f17412e = obj;
    }

    @Override // p.AbstractC5028d
    public final String e() {
        switch (this.f17411d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
