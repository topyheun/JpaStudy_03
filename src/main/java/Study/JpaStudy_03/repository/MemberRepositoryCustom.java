package Study.JpaStudy_03.repository;

import Study.JpaStudy_03.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
