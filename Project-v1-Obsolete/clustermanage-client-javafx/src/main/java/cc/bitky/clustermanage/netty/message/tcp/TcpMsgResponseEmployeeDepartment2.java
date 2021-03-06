package cc.bitky.clustermanage.netty.message.tcp;

import cc.bitky.clustermanage.netty.message.MsgType;
import cc.bitky.clustermanage.netty.message.base.BaseTcpResponseMsg;

/**
 * 设备回复: 员工部门更新
 */
public class TcpMsgResponseEmployeeDepartment2 extends BaseTcpResponseMsg {

    public TcpMsgResponseEmployeeDepartment2(int groupId, int boxId, int status) {
        super(groupId, boxId, status);
        setMsgId(MsgType.DEVICE_RESPONSE_EMPLOYEE_DEPARTMENT_2);
    }
}
